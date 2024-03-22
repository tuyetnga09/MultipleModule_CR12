package com.example.systemcore.repository;

import com.example.systemcore.entity.TasksWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksWorkRepository extends JpaRepository<TasksWork, Long> {
}
