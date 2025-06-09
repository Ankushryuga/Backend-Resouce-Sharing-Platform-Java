package com.ankush.Resource_sharing_app.repository;

import com.ankush.Resource_sharing_app.model.user.Users;
import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface WorkStreamRepository extends JpaRepository<WorkStreams, Integer> {

    @Query("SELECT s FROM WorkStreams s WHERE s.owner = :username AND s.active = true")
    List<WorkStreams> findByOwner(@Param("username") String username);
    boolean existsByContentName(String contentName);

    @Query("SELECT s FROM WorkStreams s WHERE s.owner = :username AND s.active = false")
    List<WorkStreams>findByInActiveAndOwner(@Param("username") String username);


    @Query("SELECT w.managers FROM WorkStreams w WHERE w.workStreamId = :id")
    List<Users> findManagersByWorkStreamId(@Param("id") int id);

    @Query("SELECT w.reporters FROM WorkStreams w WHERE w.workStreamId = :id")
    List<Users> findReportersByWorkStreamId(@Param("id") int id);

    @Query("SELECT w.contributers FROM WorkStreams w WHERE w.workStreamId = :id")
    List<Users> findContributersByWorkStreamId(@Param("id") int id);

    @Query("SELECT w.testers FROM WorkStreams w WHERE w.workStreamId = :id")
    List<Users> findTestersByWorkStreamId(@Param("id") int id);



}
