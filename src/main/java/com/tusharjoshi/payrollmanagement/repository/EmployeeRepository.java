package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
//    @Service
//    public class EmployeeService{
//        private final EmployeeRepository employeeRepository;
//
//        public EmployeeService(EmployeeRepository employeeRepository) {
//            this.employeeRepository = employeeRepository;
//        }
//
//        public Employee save(Employee employee){
//            return employeeRepository.save(employee);
//        }
//
//        public Employee findById(Long id){
//            return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found with id: "+id));
//        }
//
//        public void deleteById(Long id){
//            employeeRepository.deleteById(id);
//        }
//    }
}
