package com.ankush.Resource_sharing_app.repository;

import com.ankush.Resource_sharing_app.dto.TaskDTO.GetAllTaskInSprintRequestDT0;
import com.ankush.Resource_sharing_app.dto.TaskDTO.TaskResponseDTO;
import com.ankush.Resource_sharing_app.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, UUID> {

    @Query("SELECT COUNT(t) > 0 FROM Tasks t WHERE t.taskName = :taskName AND t.sprints.sprintId = :sprintId")
    boolean doesTaskExistsForSprint(@Param("taskName") String taskName, @Param("sprintId") int sprintId);

    @Query("SELECT s FROM Tasks s WHERE s.sprints.id = :sprintId")
    List<Tasks> findAlTasklBySprintId(@Param("sprintId") int sprintId);
}
