package com.ankush.Resource_sharing_app.controller.TaskController;

import com.ankush.Resource_sharing_app.dto.TaskDTO.TaskResponseDTO;
import com.ankush.Resource_sharing_app.services.TaskServices;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/task")
public class TaskController {
    private final TaskServices taskServices;

    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    @GetMapping("/getAllTasks")
    public ResponseEntity<List<TaskResponseDTO>> getTasks(){
        List<TaskResponseDTO> tasks=taskServices.getAllTasks();
        return ResponseEntity.ok().body(tasks);
    }
}
