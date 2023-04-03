package com.example.todo_list.dto;

import com.example.todo_list.enums.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponse {
    private String name;
    private TaskStatus status;
    private LocalDateTime createdAt;
}
