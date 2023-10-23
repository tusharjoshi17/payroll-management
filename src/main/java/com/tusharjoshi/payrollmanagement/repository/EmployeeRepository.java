package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.Employee;

public interface EmployeeRepository extends BaseRepository<Employee, Long> {
    public class EmployeeService {
        private final EmployeeRepository employeeRepository;

        public EmployeeService(EmployeeRepository employeeRepository) {
            this.employeeRepository = employeeRepository;
        }
    }
}
