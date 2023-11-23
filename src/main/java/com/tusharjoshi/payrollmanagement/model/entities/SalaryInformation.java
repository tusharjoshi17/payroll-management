package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class SalaryInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salaryId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private Double monthlySalary;
    private Double monthlyDeductions;
    private LocalDate salaryPeriodStartDate;
    private LocalDate salaryPeriodEndDate;

    public SalaryInformation(Employee employee, Double monthlySalary, Double monthlyDeductions, LocalDate salaryPeriodStartDate, LocalDate salaryPeriodEndDate) {
        this.employee = employee;
        this.monthlySalary = monthlySalary;
        this.monthlyDeductions = monthlyDeductions;
        this.salaryPeriodStartDate = salaryPeriodStartDate;
        this.salaryPeriodEndDate = salaryPeriodEndDate;
    }
    public SalaryInformation(){}

}
