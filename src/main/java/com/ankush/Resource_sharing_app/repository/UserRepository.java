package com.ankush.Resource_sharing_app.repository;

import com.ankush.Resource_sharing_app.dto.UserDTO.UserResponseDTO;
import com.ankush.Resource_sharing_app.model.user.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<Users, UUID> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    List<Users>findAll();

    @Query("SELECT u FROM Users u WHERE u.username = :value OR u.email = :value")
    Users findUserByUsernameOrEmail(@Param("value") String value);

//    @Query("SELECT u FROM Users u WHERE u.userId IN :userList")
//    List<Users> findAllByUserId(@Param("userList") List<UUID> userList);

    List<Users> findAllByUserIdIn(List<Long> ids);


//    @Query("SELECT u FROM Users u JOIN u.workStreams ws WHERE w.id = :id")
//    List<Users> findAllByWorkStreamId(@Param("id") int workStreamId);
}
