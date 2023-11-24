package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.TimeInformation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for performing CRUD operations on the SalaryInformation entity.
 */
public interface TimeInformationRepository extends JpaRepository<TimeInformation,Long> {

}
