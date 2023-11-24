package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @NotNull(message = "Monthly salary is mandatory")
    @Positive(message = "Monthly salary should be positive")
    private Double monthlySalary;
    private Double monthlyDeductions;

    @NotNull(message = "Salary period start date is mandatory")
    private LocalDate salaryPeriodStartDate;
    @NotNull(message = "Salary period end date is mandatory")
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
