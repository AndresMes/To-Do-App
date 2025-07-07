package com.bat.battodo.repositories;

import com.bat.battodo.entities.SubTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubTaskRepository extends JpaRepository<SubTask, Long> {
}
