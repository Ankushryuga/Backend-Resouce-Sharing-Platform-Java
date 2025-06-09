package com.ankush.Resource_sharing_app.mapper;

import com.ankush.Resource_sharing_app.dto.TaskDTO.TaskRequestDTO;
import com.ankush.Resource_sharing_app.dto.TaskDTO.TaskResponseDTO;
import com.ankush.Resource_sharing_app.model.TaskStatus;
import com.ankush.Resource_sharing_app.model.Tasks;
import com.ankush.Resource_sharing_app.model.sprints.Sprints;
import com.ankush.Resource_sharing_app.model.tasks.Priority;
import com.ankush.Resource_sharing_app.model.tasks.TaskResolution;

/**
 * private String taskName;
 *     private TaskStatus status;
 *     private String taskDescription;
 *     private List<Attachment> attachments; // This is raw JSON string
 *     @NotNull(message = "Sprint is required")
 *     private int sprintId;
 *     private String type;
 *     private int resolutionId;
 *     private String assignee;
 *     private String priorityId;
 */
public class TaskMapper {
    public static Tasks  toEntity(TaskRequestDTO dto){
        Tasks tasks=new Tasks();
        tasks.setTaskName(dto.getTaskName());
        tasks.setTaskDescription(dto.getTaskDescription());

        TaskStatus status=new TaskStatus();
        status.setStatusId(dto.getStatusId());
        tasks.setStatus(status);
        tasks.setAttachments(dto.getAttachments());
        Sprints sprints=new Sprints();
        sprints.setSprintId(dto.getSprintId());
        tasks.setSprints(sprints);
        tasks.setType(dto.getType());
        TaskResolution resolution=new TaskResolution();
        resolution.setResolutionId(dto.getResolutionId());
        tasks.setResolution(resolution);
        tasks.setAssignee(dto.getAssignee());
        Priority priority=new Priority();
        priority.setPriorityId(dto.getPriorityId());
        tasks.setPriority(priority);
        return tasks;
    }
    public static TaskResponseDTO toDTO(Tasks tasks){
        TaskResponseDTO taskResponseDTO=new TaskResponseDTO();
        taskResponseDTO.setTaskId(tasks.getTaskId());
        taskResponseDTO.setTaskName(tasks.getTaskName());
        taskResponseDTO.setTaskDescription(tasks.getTaskDescription());
        taskResponseDTO.setTaskStatus(tasks.getStatus().getStatusName());
        if(tasks.getAttachments()!=null) {
            taskResponseDTO.setAttachments(tasks.getAttachments());
        }
        taskResponseDTO.setAssignee(tasks.getAssignee());
        taskResponseDTO.setDueDate(tasks.getDueDate());
        taskResponseDTO.setPriorityName(tasks.getPriority().getPriorityName());
        taskResponseDTO.setType(tasks.getType());
        taskResponseDTO.setResolution(tasks.getResolution().getResolutionName());
        return taskResponseDTO;
    }

//    public static void updateEntityFromDTO(TaskResponseDTO dto, Tasks task){
//    }
}
