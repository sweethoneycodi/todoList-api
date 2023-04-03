package com.example.todo_list.service;

import com.example.todo_list.dto.TaskDto;
import com.example.todo_list.dto.TaskResponse;
import com.example.todo_list.model.Task;

import java.util.List;

public interface TaskService {
    String createTask(TaskDto taskDto);

    TaskResponse getTask(Long id);

    List<TaskDto> getAllTask();
}
