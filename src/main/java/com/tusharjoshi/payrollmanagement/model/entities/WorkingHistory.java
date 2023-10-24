package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

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
}
