package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Entity
@Table(name = "working_history")
public class WorkingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long workingHistoryId;
@ManyToOne
@JoinColumn(name = "employee_id")
private Employee employee;
//(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
private String companyName;
private String employerName;
private int yearsOfExperience;
private LocalDate previousStartDate;
private LocalDate previousEndDate;

    public WorkingHistory(Employee employee, String companyName, String employerName, int yearsOfExperience, LocalDate previousStartDate, LocalDate previousEndDate) {
        this.employee = employee;
        this.companyName = companyName;
        this.employerName = employerName;
        this.yearsOfExperience = yearsOfExperience;
        this.previousStartDate = previousStartDate;
        this.previousEndDate = previousEndDate;
    }
    public WorkingHistory(){}

    public void setWorkingHistoryId(long workingHistoryId) {
        this.workingHistoryId = workingHistoryId;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setPreviousStartDate(LocalDate previousStartDate) {
        this.previousStartDate = previousStartDate;
    }

    public void setPreviousEndDate(LocalDate previousEndDate) {
        this.previousEndDate = previousEndDate;
    }
}
