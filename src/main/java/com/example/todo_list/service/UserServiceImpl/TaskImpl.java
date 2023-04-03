package com.example.todo_list.service.UserServiceImpl;

import com.example.todo_list.dto.TaskDto;
import com.example.todo_list.dto.TaskResponse;
import com.example.todo_list.model.Task;
import com.example.todo_list.model.User;
import com.example.todo_list.repository.TaskRepository;
import com.example.todo_list.repository.UserRepository;
import com.example.todo_list.service.TaskService;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class TaskImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final UserRepository userRepository;
    @Override
    public String createTask(TaskDto taskDto) {

        Task task = new Task();
        task.setName(taskDto.getName());
        task.setStatus(taskDto.getStatus());
        task.setCreatedAt(taskDto.getCreatedAt());

        taskRepository.save(task);


        return "Task have been successfully created";
    }

    @Override
    public TaskResponse getTask(Long id) {
        TaskResponse response = new TaskResponse();
        Task task = taskRepository.findById(id).orElseThrow(()-> new RuntimeException("task not found"));
        response.setName(task.getName());
        response.setStatus(task.getStatus());
        return response;
    }

    @Override
    public List<TaskDto> getAllTask() {
        TaskDto allTasks = new TaskDto();
        List<Task> tasks = new ArrayList<>();
        tasks.stream().map(()->allTasks).collect(Collectors.toList())

        return null;
    }
}
