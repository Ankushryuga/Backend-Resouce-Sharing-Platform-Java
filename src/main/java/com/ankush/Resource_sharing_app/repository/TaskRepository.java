package com.ankush.Resource_sharing_app.repository;

import com.ankush.Resource_sharing_app.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, UUID> {
}
