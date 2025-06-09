package com.ankush.Resource_sharing_app.services.UserService;


import com.ankush.Resource_sharing_app.dto.UserDTO.UserLoginRequest;
import com.ankush.Resource_sharing_app.dto.UserDTO.UserRequestDTO;
import com.ankush.Resource_sharing_app.dto.UserDTO.UserResponseDTO;
import com.ankush.Resource_sharing_app.exception.UsersExceptions.UserExistsByEmail;
import com.ankush.Resource_sharing_app.exception.UsersExceptions.UserExistsByName;
import com.ankush.Resource_sharing_app.exception.UsersExceptions.UserNotFound;
import com.ankush.Resource_sharing_app.mapper.UserMapper.UserMapper;
import com.ankush.Resource_sharing_app.model.user.Users;
import com.ankush.Resource_sharing_app.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    //Login user:
    public UserResponseDTO loginUser(UserLoginRequest dto){
        if(!(userRepository.existsByUsername(dto.getUserrnameOrEmail())) && !(userRepository.existsByEmail(dto.getUserrnameOrEmail()))){
            throw new UserNotFound("user not found");
        }
        Users user=userRepository.findUserByUsernameOrEmail(dto.getUserrnameOrEmail());
        return UserMapper.toResponseDTO(user);
    }

    //Create new user:
    public UserResponseDTO createNewUser(UserRequestDTO dto){
        if(userRepository.existsByUsername(dto.getUsername())){
            throw new UserExistsByName(dto.getUsername());
        }
        if(userRepository.existsByEmail(dto.getEmail())){
            throw new UserExistsByEmail(dto.getEmail());
        }
        Users users=userRepository.save(UserMapper.toEntity(dto));
        return UserMapper.toResponseDTO(users);
    }


    //Update user:
    //    public UserResponseDTO updateUser(){}

    //Delete user:
    //public void deleteUser(){}

    //Get All user:
    public List<UserResponseDTO> getAllUsers(){
        List<Users> users=userRepository.findAll();
        return users.stream().map(UserMapper::toResponseDTO).toList();
    }
}
