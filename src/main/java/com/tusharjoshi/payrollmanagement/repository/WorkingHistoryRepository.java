package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.WorkingHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for performing CRUD operations on the SalaryInformation entity.
 */
public interface WorkingHistoryRepository extends JpaRepository<WorkingHistory,Long> {

}
