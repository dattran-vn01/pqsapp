package com.pqsoft.task.api.dao;

import com.pqsoft.task.api.model.Leave;
import com.pqsoft.task.api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave, Integer> {
}
