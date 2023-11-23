package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "working_history")
public class WorkingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workingHistoryId;
@ManyToOne
@JoinColumn(name = "employee_id")
private Employee employee;
//(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
private String companyName;
private String employerName;
private Integer yearsOfExperience;
private LocalDate previousStartDate;
private LocalDate previousEndDate;

    public WorkingHistory(Employee employee, String companyName, String employerName, Integer yearsOfExperience, LocalDate previousStartDate, LocalDate previousEndDate) {
        this.employee = employee;
        this.companyName = companyName;
        this.employerName = employerName;
        this.yearsOfExperience = yearsOfExperience;
        this.previousStartDate = previousStartDate;
        this.previousEndDate = previousEndDate;
    }
    public WorkingHistory(){}

}
