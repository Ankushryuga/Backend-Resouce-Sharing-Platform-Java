package com.ankush.Resource_sharing_app.mapper;

import com.ankush.Resource_sharing_app.dto.TaskRequestDTO;
import com.ankush.Resource_sharing_app.dto.TaskResponseDTO;
import com.ankush.Resource_sharing_app.model.Tasks;

public class TaskMapper {
    public static Tasks  toEntity(TaskRequestDTO dto){
        Tasks tasks=new Tasks();
        tasks.setTaskName(dto.getTaskName());
        tasks.setStatus(dto.getStatus());
        tasks.setTaskDescription(dto.getTaskDescription());
        tasks.setAttachments(dto.getAttachments());
        tasks.setCreatedBy(dto.getCreatedBy());
        tasks.setCreatedAt(dto.getCreatedAt());
        return tasks;
    }
    public static TaskResponseDTO toDTO(Tasks tasks){
        TaskResponseDTO dto=new TaskResponseDTO();
        dto.setTaskId(tasks.getTaskId());
        dto.setTaskName(tasks.getTaskName());
        dto.setTaskDescription(tasks.getTaskDescription());
        dto.setAttachments(tasks.getAttachments());
        dto.setCreatedBy(tasks.getCreatedBy());
        dto.setCreatedAt(tasks.getCreatedAt());
        return dto;
    }

    public static void updateEntityFromDTO(TaskResponseDTO dto, Tasks task){
        task.setTaskName(dto.getTaskName());
        task.setTaskDescription(dto.getTaskDescription());
        task.setStatus(dto.getStatus());
        task.setAttachments(dto.getAttachments());
        task.setCreatedAt(dto.getCreatedAt());
        task.setCreatedBy(dto.getCreatedBy());
    }
}
