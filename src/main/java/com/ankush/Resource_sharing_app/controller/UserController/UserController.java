package com.ankush.Resource_sharing_app.controller.UserController;

import com.ankush.Resource_sharing_app.dto.UserDTO.UserLoginRequest;
import com.ankush.Resource_sharing_app.dto.UserDTO.UserRequestDTO;
import com.ankush.Resource_sharing_app.dto.UserDTO.UserResponseDTO;
import com.ankush.Resource_sharing_app.services.UserService.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("/login")
    public ResponseEntity<UserResponseDTO> loginUser(@Valid @RequestBody UserLoginRequest dto){
        UserResponseDTO responseDTO=userService.loginUser(dto);
        return ResponseEntity.ok().body(responseDTO);
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserResponseDTO> createNewUser(@Valid @RequestBody UserRequestDTO dto){
        UserResponseDTO response=userService.createNewUser(dto);
        return ResponseEntity.ok().body(response);
    }
    @GetMapping("/getAllUser")
    public ResponseEntity<List<UserResponseDTO>> getAllUser(){
        List<UserResponseDTO> users=userService.getAllUsers();
        return ResponseEntity.ok().body(users);
    }
}
