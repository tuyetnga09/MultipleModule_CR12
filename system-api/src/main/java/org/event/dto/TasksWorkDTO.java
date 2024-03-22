package org.event.dto;

import com.example.systemcore.entity.Department;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class TasksWorkDTO {
    private Long id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime endTime;
    private String type;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private Department department;
}
