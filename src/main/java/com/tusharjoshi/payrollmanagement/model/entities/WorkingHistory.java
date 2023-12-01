package com.tusharjoshi.payrollmanagement.model.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
