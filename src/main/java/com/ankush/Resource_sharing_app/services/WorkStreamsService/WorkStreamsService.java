package com.ankush.Resource_sharing_app.services.WorkStreamsService;

import com.ankush.Resource_sharing_app.dto.UserDTO.UserResponseDTO;
import com.ankush.Resource_sharing_app.dto.WorkStreamsDTO.WorkStreamsRequestDTO;
import com.ankush.Resource_sharing_app.dto.WorkStreamsDTO.WorkStreamsResponseDTO;
import com.ankush.Resource_sharing_app.model.user.UserRoles;
import com.ankush.Resource_sharing_app.model.user.Users;
import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import com.ankush.Resource_sharing_app.repository.UserRepository;
import com.ankush.Resource_sharing_app.repository.WorkStreamRepository;
import org.apache.catalina.User;
import org.hibernate.jdbc.Work;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ankush.Resource_sharing_app.mapper.WorkStreamMapper.WorkStreamMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkStreamsService {
    private final WorkStreamRepository workStreamRepository;
    private final UserRepository userRepository;

    public WorkStreamsService(WorkStreamRepository workStreamRepository, UserRepository userRepository){
        this.workStreamRepository=workStreamRepository;
        this.userRepository=userRepository;
    }

    private UserResponseDTO mapToUserResponseDTO(Users user){
        UserResponseDTO dto = new UserResponseDTO();
        dto.setUserId(user.getUserId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setRoleType(user.getRole()); // or dto.setRole(), depending on your field
        dto.setFolder(new ArrayList<>()); // or actual folders if needed
        return dto;
    }

//    Getting all active workstream
    public List<WorkStreamsResponseDTO> getWorkStreams(String owner){
        List<WorkStreams> workStreams=workStreamRepository.findByOwner(owner);
        return workStreams.stream().map(workStream -> {
            int workStreamId=workStream.getWorkStreamId();

            WorkStreamsResponseDTO dto=new WorkStreamsResponseDTO();
            dto.setWorkStreamId(workStreamId);
            dto.setContentName(workStream.getContentName());
            dto.setContentDescription(workStream.getContentDescription());
            dto.setOwner(workStream.getOwner());
            dto.setActive(workStream.getActive());

            List<Users> managers=workStreamRepository.findManagersByWorkStreamId(workStreamId);
            List<Users> reporters=workStreamRepository.findReportersByWorkStreamId(workStreamId);
            List<Users> contributors=workStreamRepository.findContributersByWorkStreamId(workStreamId);
            List<Users> testers=workStreamRepository.findTestersByWorkStreamId(workStreamId);

            dto.setManagers(managers.stream().map(this::mapToUserResponseDTO).toList());
            dto.setReporters(reporters.stream().map(this::mapToUserResponseDTO).toList());
            dto.setContributers(contributors.stream().map(this::mapToUserResponseDTO).toList());
            dto.setTesters(testers.stream().map(this::mapToUserResponseDTO).toList());

            return dto;
        }).toList();
//        return workStreams.stream().map(WorkStreamMapper::toResponseDTO).toList();
    }

    //Getting all inactive workstream:
    public List<WorkStreamsResponseDTO> getAllInActiveWorkStreams(String owner){
        List<WorkStreams> workStreams=workStreamRepository.findByInActiveAndOwner(owner);
        return workStreams.stream().map(WorkStreamMapper::toResponseDTO).toList();
    }



//    creating new workstream.
    public WorkStreamsResponseDTO createWorkStream(WorkStreamsRequestDTO workStreamsRequestDTO){
        WorkStreams workStreams=new WorkStreams();
        workStreams.setContentName(workStreamsRequestDTO.getContentName());
        workStreams.setContentDescription(workStreamsRequestDTO.getContentDescription());
        workStreams.setOwner(workStreamsRequestDTO.getOwner());
        workStreams.setActive(true);
        if(workStreamsRequestDTO.getManagers()!=null && !workStreamsRequestDTO.getManagers().isEmpty()){
            List<Users> managers=userRepository.findAllByUserIdIn(workStreamsRequestDTO.getManagers());
            workStreams.setManagers(managers);
        }
        if(workStreamsRequestDTO.getReporters()!=null && !workStreamsRequestDTO.getReporters().isEmpty()){
            List<Users> reporters=userRepository.findAllByUserIdIn(workStreamsRequestDTO.getReporters());
            workStreams.setReporters(reporters);
        }
        if(workStreamsRequestDTO.getContributers()!=null && !workStreamsRequestDTO.getContributers().isEmpty()){
            List<Users> contributors=userRepository.findAllByUserIdIn(workStreamsRequestDTO.getContributers());
            workStreams.setContributers(contributors);
        }
        if(workStreamsRequestDTO.getTesters()!=null && !workStreamsRequestDTO.getTesters().isEmpty()){
            List<Users>testers=userRepository.findAllByUserIdIn(workStreamsRequestDTO.getTesters());
            workStreams.setTesters(testers);
        }
        WorkStreams save=workStreamRepository.save(workStreams);
        return WorkStreamMapper.toResponseDTO(save);
    }
}
