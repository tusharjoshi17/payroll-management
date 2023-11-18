package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;
@Getter
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    public enum DepartmentName{
        HR,
        IT,
        Finance,
        Marketing,
        Sales,
        Operations,
        Management
    }

    @Enumerated(EnumType.STRING)
    private DepartmentName departmentName;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department(DepartmentName departmentName, List<Employee> employees, long departmentId) {
        this.departmentName = departmentName;
        this.employees = employees;
        this.departmentId = departmentId;
    }

    public Department(){}

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(DepartmentName departmentName) {
        this.departmentName = departmentName;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
