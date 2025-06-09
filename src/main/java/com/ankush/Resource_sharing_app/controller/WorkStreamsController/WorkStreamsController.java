package com.ankush.Resource_sharing_app.controller.WorkStreamsController;

import com.ankush.Resource_sharing_app.dto.UserDTO.UserRequestDTO;
import com.ankush.Resource_sharing_app.dto.WorkStreamsDTO.WorkStreamsRequestDTO;
import com.ankush.Resource_sharing_app.dto.WorkStreamsDTO.WorkStreamsResponseDTO;
import com.ankush.Resource_sharing_app.model.user.Users;
import com.ankush.Resource_sharing_app.services.WorkStreamsService.WorkStreamsService;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workstreams")
public class WorkStreamsController {

    //i think this part call propagation.
    private final WorkStreamsService workStreamsService;
    public WorkStreamsController(WorkStreamsService workStreamsService){
        this.workStreamsService=workStreamsService;
    }
    //All the active workstreams user is working in or managing.
    @GetMapping("/getAllWorkstreams")
    public ResponseEntity<List<WorkStreamsResponseDTO>>
    getAllWorkStreams(@RequestParam String owner){
        List<WorkStreamsResponseDTO> workStreamsResponseDTOS= workStreamsService.getWorkStreams(owner);
        return ResponseEntity.ok(workStreamsResponseDTOS);
    }
    @GetMapping("/getAllInActiveWorkstreams")
    public ResponseEntity<List<WorkStreamsResponseDTO>> getAllInActiveWorkStreams(@RequestParam String owner){
        List<WorkStreamsResponseDTO> workStreamsResponseDTOS=workStreamsService.getAllInActiveWorkStreams(owner);
        return ResponseEntity.ok(workStreamsResponseDTOS);
    }


    @PostMapping("/createWorkstream")
    public ResponseEntity<WorkStreamsResponseDTO> createWorkStream(@Valid @RequestBody WorkStreamsRequestDTO workStreamsRequestDTO){
        WorkStreamsResponseDTO workStreamsResponseDTO=workStreamsService.createWorkStream(workStreamsRequestDTO);
        return ResponseEntity.ok().body(workStreamsResponseDTO);
    }

//    @PatchMapping("/updateWorkstream")
//    public ResponseEntity<WorkStreamsResponseDTO> updateWorkStream(@Valid @RequestBody WorkStreamsRequestDTO workStreamsRequestDTO){
//        WorkS
//    }
}
