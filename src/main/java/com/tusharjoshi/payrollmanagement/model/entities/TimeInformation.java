package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
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

    public void setTimeInformationId(Long timeInformationId) {
        this.timeInformationId = timeInformationId;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setWorkedHours(Integer workedHours) {
        this.workedHours = workedHours;
    }

    public void setOffHours(Integer offHours) {
        this.offHours = offHours;
    }

    public void setDaysOff(Integer daysOff) {
        this.daysOff = daysOff;
    }

    public void setOverTime(Integer overTime) {
        this.overTime = overTime;
    }

    public void setExtraDays(Integer extraDays) {
        this.extraDays = extraDays;
    }

    public void setWorkPeriodStartDate(LocalDate workPeriodStartDate) {this.workPeriodStartDate = workPeriodStartDate;}

    public void setWorkPeriodEndDate(LocalDate workPeriodEndDate) {
        this.workPeriodEndDate = workPeriodEndDate;
    }
}
