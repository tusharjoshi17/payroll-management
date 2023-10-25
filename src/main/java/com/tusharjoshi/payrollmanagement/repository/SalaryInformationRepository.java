package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.SalaryInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryInformationRepository extends JpaRepository<SalaryInformation,Long> {
}
