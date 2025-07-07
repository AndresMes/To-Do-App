package com.bat.battodo.services;

import com.bat.battodo.dtos.SubTaskDTO;

import java.util.List;

public interface SubTaskService {

    SubTaskDTO saveSubTask(SubTaskDTO subTaskDTO);
    SubTaskDTO getSubTaskByTitle(String title);
    List<SubTaskDTO> getAllSubTasksOfTask(Long idTask);
    SubTaskDTO updateSubTask(SubTaskDTO subTaskDTO);
    void deleteSubTaskByTitle(String title);
}
