package com.ankush.Resource_sharing_app.repository;

import com.ankush.Resource_sharing_app.model.sprints.Sprints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SprintRepository extends JpaRepository<Sprints, Integer> {
    List<Sprints>findAll();
    Sprints findBySprintNameAndWorkStreams_WorkStreamId(String sprintName, int workStreamId);
    boolean existsBySprintNameAndWorkStreams_WorkStreamId(String sprintName, int workStreamId);

    @Query("SELECT COUNT(s)>0 FROM Sprints s WHERE s.sprintName = :sprintName AND s.workStreams.workStreamId = :workStreamId")
    boolean doesSprintExistsForWorkStream(@Param("sprintName") String sprintName, @Param("workStreamId") int workStreamId);


//    //Get all sprints in workstreams:
//    @Query("SELECT s FROM Sprints s WHERE s.workStreams.workStreamsId = :workStreamId")
//    List<Sprints>findAllSprintsInWorkStream(@Param("workStreamId") int workStreamId);

    List<Sprints> findByWorkStreams_WorkStreamId(int workStreamId);

}
