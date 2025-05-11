package com.ankush.Resource_sharing_app.services;

import com.ankush.Resource_sharing_app.dto.TaskResponseDTO;
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


    public List<TaskResponseDTO> getAllTasks(){
        List<Tasks> tasks=taskRepository.findAll();
        return tasks.stream().map(TaskMapper::toDTO).toList();
    }
}
