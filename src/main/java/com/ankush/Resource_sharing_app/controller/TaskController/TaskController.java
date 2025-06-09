package com.ankush.Resource_sharing_app.controller.TaskController;

import com.ankush.Resource_sharing_app.dto.TaskDTO.GetAllTaskInSprintRequestDT0;
import com.ankush.Resource_sharing_app.dto.TaskDTO.TaskRequestDTO;
import com.ankush.Resource_sharing_app.dto.TaskDTO.TaskResponseDTO;
import com.ankush.Resource_sharing_app.services.TaskServices;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskServices taskServices;

    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    @PostMapping("/createNewTask")
    public ResponseEntity<TaskResponseDTO> createNewTask(@Valid @RequestBody TaskRequestDTO taskRequestDTO){
        TaskResponseDTO taskResponseDTO=taskServices.createNewTask(taskRequestDTO);
        return ResponseEntity.ok().body(taskResponseDTO);
    }

    @GetMapping("/getAllTasks")
    public ResponseEntity<List<TaskResponseDTO>> getTasks(@Valid @RequestBody GetAllTaskInSprintRequestDT0 sprintId){
        List<TaskResponseDTO> tasks=taskServices.getAllTasks(sprintId);
        return ResponseEntity.ok().body(tasks);
    }

}
