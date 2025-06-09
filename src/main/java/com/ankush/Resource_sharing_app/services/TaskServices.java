package com.ankush.Resource_sharing_app.services;

import com.ankush.Resource_sharing_app.dto.TaskDTO.GetAllTaskInSprintRequestDT0;
import com.ankush.Resource_sharing_app.dto.TaskDTO.TaskRequestDTO;
import com.ankush.Resource_sharing_app.dto.TaskDTO.TaskResponseDTO;
import com.ankush.Resource_sharing_app.exception.TaskExceptions.TaskNameAlreadyExistsInSprint;
import com.ankush.Resource_sharing_app.mapper.TaskMapper;
import com.ankush.Resource_sharing_app.model.Tasks;
import com.ankush.Resource_sharing_app.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskServices {
    private final TaskRepository taskRepository;

    public TaskServices(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskResponseDTO createNewTask(TaskRequestDTO dto){
        if(taskRepository.doesTaskExistsForSprint(dto.getTaskName(), dto.getSprintId())){
            throw new TaskNameAlreadyExistsInSprint(dto.getTaskName()+" already exits");
        }
        Tasks tasks=taskRepository.save(TaskMapper.toEntity(dto));
        return TaskMapper.toDTO(tasks);
    }


    //get all tasks
    public List<TaskResponseDTO> getAllTasks(GetAllTaskInSprintRequestDT0 requestDT0){
        List<Tasks> tasks=taskRepository.findAlTasklBySprintId(requestDT0.getSprintId());
        return tasks.stream().map(TaskMapper::toDTO).toList();
    }


}
