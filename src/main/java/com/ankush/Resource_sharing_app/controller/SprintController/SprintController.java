package com.ankush.Resource_sharing_app.controller.SprintController;

import com.ankush.Resource_sharing_app.dto.SprintDTO.SprintRequestDTO;
import com.ankush.Resource_sharing_app.dto.SprintDTO.SprintResponseDTO;
import com.ankush.Resource_sharing_app.services.SprintService.SprintService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sprints")
public class SprintController {
    private final SprintService sprintService;
    public SprintController(SprintService sprintService){
        this.sprintService=sprintService;
    }
    @PostMapping("/createNewSprints")
    public ResponseEntity<SprintResponseDTO> createNewSprint(@Valid @RequestBody SprintRequestDTO dto){
        SprintResponseDTO sprintResponseDTO= sprintService.createNewSprint(dto);
        return ResponseEntity.ok().body(sprintResponseDTO);
    }

    @GetMapping("/getAllSprints")
    public ResponseEntity<List<SprintResponseDTO>> getAllSprints(){
        List<SprintResponseDTO> sprints=sprintService.getAllSprints();
        return ResponseEntity.ok().body(sprints);
    }

    @GetMapping("/getAllSprintsInWorkStreams")
    public ResponseEntity<List<SprintResponseDTO>>getAllSprintsInWorkStreams(@RequestParam  int workStreamId){
        List<SprintResponseDTO>sprints=sprintService.getAllSprintsInWorkStreams(workStreamId);
        return ResponseEntity.ok().body(sprints);
    }
}
