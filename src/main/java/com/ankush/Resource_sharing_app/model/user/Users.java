package com.ankush.Resource_sharing_app.model.user;

import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
public class Users{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;

    @NotNull
    private String username;


    private String email;

    @Enumerated(EnumType.STRING)
    private UserRoles role;

    @ManyToMany
    @JoinTable(name = "user_workstreams", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="workstream_id"))
    private List<WorkStreams> workStreams;

    public List<WorkStreams> getWorkStreams() {
        return workStreams;
    }

    public void setWorkStreams(List<WorkStreams> workStreams) {
        this.workStreams = workStreams;
    }

    @Convert(converter = UserSpecificFoldersConverter.class)
    @Column(name = "user_specific_folders", columnDefinition = "TEXT")
    private List<UserSpecificFolders> folder;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public @NotNull String getUsername() {
        return username;
    }

    public void setUsername(@NotNull String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<UserSpecificFolders> getFolder() {
        return folder;
    }

    public void setFolder(List<UserSpecificFolders> folder) {
        this.folder = folder;
    }

    public UserRoles getRole() {
        return role;
    }

    public void setRole(UserRoles role) {
        this.role = role;
    }
}


