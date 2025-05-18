package com.ankush.Resource_sharing_app.mapper.UserMapper;

import com.ankush.Resource_sharing_app.dto.UserDTO.UserRequestDTO;
import com.ankush.Resource_sharing_app.dto.UserDTO.UserResponseDTO;
import com.ankush.Resource_sharing_app.model.user.Users;

public class UserMapper {
    // to model...
    private static Users toEntity(UserRequestDTO dto){
        Users user=new Users();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setFolder(dto.getFolder());
        return user;
    }

    //to DTO...
    public static UserResponseDTO toResponseDTO(Users user){
        UserResponseDTO dto=new UserResponseDTO();
        dto.setUserId(user.getUserId()+"");
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setFolder(user.getFolder());
        return dto;
    }

//    For updates
    public static void updateEntiyFromDTO(UserRequestDTO dto, Users user){
        if(dto.getUsername()!=null){
            user.setUsername(dto.getUsername());
        }
        if(dto.getEmail()!=null){
            user.setEmail(dto.getEmail());
        }
        if(dto.getFolder()!=null){
            user.setFolder(dto.getFolder());
        }
    }
}
