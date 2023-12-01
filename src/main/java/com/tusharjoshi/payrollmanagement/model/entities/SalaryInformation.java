package com.tusharjoshi.payrollmanagement.model.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
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

}
