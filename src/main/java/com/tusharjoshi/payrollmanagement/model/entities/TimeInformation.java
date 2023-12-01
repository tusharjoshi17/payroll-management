package com.tusharjoshi.payrollmanagement.model.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TimeInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timeInformationId;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private Integer workedHours;
    private Integer offHours;
    private Integer daysOff;
    private Integer overTime;
    private Integer extraDays;
    private LocalDate workPeriodStartDate;
    private LocalDate workPeriodEndDate;

}
