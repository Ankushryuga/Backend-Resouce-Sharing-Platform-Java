package com.ankush.Resource_sharing_app.services.SprintService;

import com.ankush.Resource_sharing_app.dto.SprintDTO.SprintRequestDTO;
import com.ankush.Resource_sharing_app.dto.SprintDTO.SprintResponseDTO;
import com.ankush.Resource_sharing_app.exception.SprintExceptions.SprintAlreadyExists;
import com.ankush.Resource_sharing_app.mapper.SprintMapper.SprintMapper;
import com.ankush.Resource_sharing_app.model.sprints.Sprints;
import com.ankush.Resource_sharing_app.repository.SprintRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprintService {
    private final SprintRepository sprintRepository;
    public SprintService(SprintRepository sprintRepository){
        this.sprintRepository=sprintRepository;
    }

    //create..
    public SprintResponseDTO createNewSprint(SprintRequestDTO dto){
        if(sprintRepository.doesSprintExistsForWorkStream(dto.getSprintName(), dto.getWorkStreamId())){
            throw new SprintAlreadyExists("Sprint with name "+dto.getSprintName()+" already exits");
        }
        Sprints sprints=sprintRepository.save(SprintMapper.toEntity(dto));
        return SprintMapper.toDTO(sprints);
    }

    //getAll
    public List<SprintResponseDTO> getAllSprints(){
        List<Sprints> sprints=sprintRepository.findAll();
        return sprints.stream().map(SprintMapper::toDTO).toList();
    }

    //getAllSprintsInWorkStream:
    public List<SprintResponseDTO> getAllSprintsInWorkStreams(int workStreamId){
        List<Sprints>sprints =sprintRepository.findByWorkStreams_WorkStreamId(workStreamId);
        return sprints.stream().map(SprintMapper::toDTO).toList();
    }
}
