package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Repository for performing CRUD operations on the Employee entity.
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
