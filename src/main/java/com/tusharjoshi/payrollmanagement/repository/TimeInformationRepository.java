package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.TimeInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeInformationRepository extends JpaRepository<TimeInformation,Long> {

}
