package com.example.todo_list.controller;

import com.example.todo_list.dto.TaskDto;
import com.example.todo_list.dto.TaskResponse;
import com.example.todo_list.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/task")
@RestController
public class TaskController {
    private TaskService taskService;
    @PostMapping
    public ResponseEntity<String> createTask(@RequestBody TaskDto taskDto) {
       String taskDtos = taskService.createTask(taskDto);
       return ResponseEntity.status(HttpStatus.CREATED).body(taskDtos);
    }
    @GetMapping
    public  ResponseEntity<TaskResponse> getTask(Long id) {
        TaskResponse response = taskService.getTask(id);
        return ResponseEntity.ok(response);
    }
    @GetMapping()
    public ResponseEntity<List<TaskDto>> getAllTask() {
        List<TaskDto> tasks = taskService.getAllTask();
        return ResponseEntity.ok(tasks);
    }

}
