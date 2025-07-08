package com.bat.battodo.entities;

import com.bat.battodo.enums.Priority;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Task {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Priority priority;
    private LocalDate deadline;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean recurrent;
    private boolean completed;

    @OneToMany(mappedBy = "task")
    private List<SubTask> subTasks;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "list_id", referencedColumnName = "ListId")
    private TaskList list;

    @OneToMany(mappedBy = "task")
    private List<Notification> notifications;
}
