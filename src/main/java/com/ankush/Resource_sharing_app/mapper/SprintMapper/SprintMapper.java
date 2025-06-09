package com.ankush.Resource_sharing_app.mapper.SprintMapper;

import com.ankush.Resource_sharing_app.dto.SprintDTO.SprintRequestDTO;
import com.ankush.Resource_sharing_app.dto.SprintDTO.SprintResponseDTO;
import com.ankush.Resource_sharing_app.model.sprints.Sprints;
import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;

public class SprintMapper {
    public static Sprints toEntity(SprintRequestDTO dto){
        Sprints sprints=new Sprints();
//        sprints.setSprintId(dto.getSprintId());
        sprints.setSprintName(dto.getSprintName());
        WorkStreams workStreams=new WorkStreams();
        workStreams.setWorkStreamId(dto.getWorkStreamId());
        sprints.setWorkStreams(workStreams);
        return sprints;
    }

    public static SprintResponseDTO toDTO(Sprints sprints){
        SprintResponseDTO sprintResponseDTO=new SprintResponseDTO();
        sprintResponseDTO.setSprintId(sprints.getSprintId());
        sprintResponseDTO.setSprintName(sprints.getSprintName());
        if(sprints.getWorkStreams()!=null){
            sprintResponseDTO.setWorkStreamId(sprints.getWorkStreams().getWorkStreamId());
        }
        return sprintResponseDTO;
    }
}
