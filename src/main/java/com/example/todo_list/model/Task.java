package com.example.todo_list.model;

import com.example.todo_list.enums.TaskStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "task_tbl")
public class Task extends Base{
    private String name;
    private TaskStatus status;

}
