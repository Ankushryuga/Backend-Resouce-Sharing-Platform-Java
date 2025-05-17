package com.ankush.Resource_sharing_app.mapper.WorkStreamMapper;

import com.ankush.Resource_sharing_app.dto.WorkStreamsDTO.WorkStreamsRequestDTO;
import com.ankush.Resource_sharing_app.dto.WorkStreamsDTO.WorkStreamsResponseDTO;
import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import org.hibernate.jdbc.Work;

public class WorkStreamMapper {
//    to model.
    private static WorkStreams toEntity(WorkStreamsRequestDTO dto){
        WorkStreams workStreams=new WorkStreams();
        workStreams.setContentName(dto.getContentName());
        workStreams.setContentDescription(dto.getContentDescription());
        workStreams.setOwner(dto.getOwner());
        workStreams.setManagers(dto.getManagers());
        workStreams.setReporters(dto.getReporters());
        workStreams.setContributers(dto.getContributers());
        workStreams.setTesters(dto.getTesters());
        workStreams.setTasks(dto.getTasks());
        return workStreams;
    }
    //to dto..
    public static WorkStreamsResponseDTO toResponseDTO(WorkStreams workStreams){
        WorkStreamsResponseDTO workStreamsResponseDTO=new WorkStreamsResponseDTO();
        workStreamsResponseDTO.setWorkStreamId(workStreamsResponseDTO.getWorkStreamId());
        workStreamsResponseDTO.setContentName(workStreamsResponseDTO.getContentName());
        workStreamsResponseDTO.setContentDescription(workStreamsResponseDTO.getContentDescription());
        workStreamsResponseDTO.setOwner(workStreams.getOwner());
        workStreamsResponseDTO.setManagers(workStreams.getManagers());
        workStreamsResponseDTO.setReporters(workStreams.getReporters());
        workStreamsResponseDTO.setContributers(workStreams.getContributers());
        workStreamsResponseDTO.setTesters(workStreams.getTesters());
        workStreamsResponseDTO.setTasks(workStreams.getTasks());
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
        if(dto.getManagers()!=null){
            workStreams.setManagers(dto.getManagers());
        }
        if(dto.getReporters()!=null){
            workStreams.setReporters(dto.getReporters());
        }
        if(dto.getContributers()!=null){
            workStreams.setTesters(dto.getTesters());
        }
        if(dto.getTasks()!=null){
            workStreams.setTasks(dto.getTasks());
        }
    }



}
