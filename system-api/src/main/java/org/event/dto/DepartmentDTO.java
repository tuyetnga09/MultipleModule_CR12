package org.event.dto;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;
import java.util.List;

public class DepartmentDTO {
    private Long id;
    @NotEmpty(message = "Club title should not be empty")
    private String nameDepartment;
    @NotEmpty(message = "Club title should not be empty")
    private String description;
    @NotEmpty(message = "Club title should not be empty")
    private String nameManager;
    @NotEmpty(message = "Club title should not be empty")
    private Integer quantityMember;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private User createdBy;
    private List<TasksWorkDTO> tasksWorks;
}
