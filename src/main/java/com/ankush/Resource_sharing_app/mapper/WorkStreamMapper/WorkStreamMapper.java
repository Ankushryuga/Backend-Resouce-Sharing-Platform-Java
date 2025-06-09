package com.ankush.Resource_sharing_app.mapper.WorkStreamMapper;

import com.ankush.Resource_sharing_app.dto.WorkStreamsDTO.WorkStreamsRequestDTO;
import com.ankush.Resource_sharing_app.dto.WorkStreamsDTO.WorkStreamsResponseDTO;
import com.ankush.Resource_sharing_app.mapper.SprintMapper.SprintMapper;
import com.ankush.Resource_sharing_app.mapper.UserMapper.UserMapper;
import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import org.hibernate.jdbc.Work;

import java.util.stream.Collectors;

public class WorkStreamMapper {
//    to model.
    public static WorkStreams toEntity(WorkStreamsRequestDTO dto){
        WorkStreams workStreams=new WorkStreams();
        workStreams.setContentName(dto.getContentName());
        workStreams.setContentDescription(dto.getContentDescription());
        workStreams.setOwner(dto.getOwner());
//        workStreams.setManagers(dto.getManagers());
//        workStreams.setReporters(dto.getReporters());
//        workStreams.setContributers(dto.getContributers());
//        workStreams.setTesters(dto.getTesters());
//        workStreams.setSprints(dto.getSprints());
        workStreams.setActive(Boolean.TRUE);
        return workStreams;
    }
    //to dto..
    public static WorkStreamsResponseDTO toResponseDTO(WorkStreams workStreams){
        WorkStreamsResponseDTO workStreamsResponseDTO=new WorkStreamsResponseDTO();
        workStreamsResponseDTO.setWorkStreamId(workStreams.getWorkStreamId());
        workStreamsResponseDTO.setContentName(workStreams.getContentName());
        workStreamsResponseDTO.setContentDescription(workStreams.getContentDescription());
        workStreamsResponseDTO.setOwner(workStreams.getOwner());

        workStreamsResponseDTO.setManagers(workStreams.getManagers()!=null?workStreams.getManagers().stream().map(UserMapper::toResponseDTO).collect(Collectors.toList()):null);
        workStreamsResponseDTO.setReporters(workStreams.getReporters()!=null?workStreams.getReporters().stream().map(UserMapper::toResponseDTO).collect(Collectors.toList()):null);
        workStreamsResponseDTO.setContributers(workStreams.getContributers()!=null?workStreams.getContributers().stream().map(UserMapper::toResponseDTO).collect(Collectors.toList()):null);
        workStreamsResponseDTO.setTesters(workStreams.getTesters()!=null?workStreams.getTesters().stream().map(UserMapper::toResponseDTO).collect(Collectors.toList()):null);
        workStreamsResponseDTO.setActive((workStreams.getActive()));
        return workStreamsResponseDTO;
    }
//    For updates:
    public static void updateEntityFromDTO(WorkStreamsRequestDTO dto, WorkStreams workStreams){
        if(dto.getContentName()!=null){
            workStreams.setContentName(dto.getContentName());
        }
        if(dto.getContentDescription()!=null){
            workStreams.setContentDescription(dto.getContentDescription());
        }
        if(dto.getOwner()!=null){
            workStreams.setOwner((dto.getOwner()));
        }
    }

}
