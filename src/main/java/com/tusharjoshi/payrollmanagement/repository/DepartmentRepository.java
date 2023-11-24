package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This interface is used to perform CRUD operations on the Department table.
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
