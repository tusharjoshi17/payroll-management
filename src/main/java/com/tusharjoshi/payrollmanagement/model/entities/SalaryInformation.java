package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
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

    public SalaryInformation(Employee employee, double monthlySalary, double monthlyDeductions, LocalDate salaryPeriodStartDate, LocalDate salaryPeriodEndDate) {
        this.employee = employee;
        this.monthlySalary = monthlySalary;
        this.monthlyDeductions = monthlyDeductions;
        this.salaryPeriodStartDate = salaryPeriodStartDate;
        this.salaryPeriodEndDate = salaryPeriodEndDate;
    }
    public SalaryInformation(){}

    public void setSalaryId(Long salaryId) {
        this.salaryId = salaryId;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlyDeductions(Double monthlyDeductions) {
        this.monthlyDeductions = monthlyDeductions;
    }

    public void setSalaryPeriodStartDate(LocalDate salaryPeriodStartDate) {
        this.salaryPeriodStartDate = salaryPeriodStartDate;
    }

    public void setSalaryPeriodEndDate(LocalDate salaryPeriodEndDate) {
        this.salaryPeriodEndDate = salaryPeriodEndDate;
    }
}
