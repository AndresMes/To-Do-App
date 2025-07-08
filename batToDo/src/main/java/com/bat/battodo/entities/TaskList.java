package com.bat.battodo.entities;

import com.bat.battodo.enums.TypeList;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TaskList {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TaskListId;

    private String name;

    @Enumerated(EnumType.STRING)
    private TypeList typeList;

    private LocalDate startDate;

    @OneToMany(mappedBy = "list")
    private List<Task> tasks;
}
