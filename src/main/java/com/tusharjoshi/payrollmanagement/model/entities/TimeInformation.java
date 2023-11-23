package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class TimeInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timeInformationId;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private Integer workedHours;
    private Integer offHours;
    private Integer daysOff;
    private Integer overTime;
    private Integer extraDays;
    private LocalDate workPeriodStartDate;
    private LocalDate workPeriodEndDate;

    public TimeInformation(Employee employee, Integer workedHours, Integer offHours, Integer daysOff, Integer overTime, Integer extraDays, LocalDate workPeriodStartDate, LocalDate workPeriodEndDate) {
        this.employee = employee;
        this.workedHours = workedHours;
        this.offHours = offHours;
        this.daysOff = daysOff;
        this.overTime = overTime;
        this.extraDays = extraDays;
        this.workPeriodStartDate = workPeriodStartDate;
        this.workPeriodEndDate = workPeriodEndDate;
    }
    public TimeInformation(){}

}
