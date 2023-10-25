package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Table(name = "working_history")
public class WorkingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long workingHistoryId;
@ManyToOne
@JoinColumn(name = "employee_id")
@Getter
private Employee employee;
//(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
@Getter
private String companyName;
@Getter
private String employerName;
@Getter
private int yearsOfExperience;
@Getter
private LocalDate previousStartDate;
@Getter
private LocalDate previousEndDate;

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
