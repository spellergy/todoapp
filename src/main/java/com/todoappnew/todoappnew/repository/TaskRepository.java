package com.todoappnew.todoappnew.repository;

import com.todoappnew.todoappnew.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
