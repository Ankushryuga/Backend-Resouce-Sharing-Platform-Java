package com.ankush.Resource_sharing_app.model.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
public class Users{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;

    @NotNull
    private String username;
}


