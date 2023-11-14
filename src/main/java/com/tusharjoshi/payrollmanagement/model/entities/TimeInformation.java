package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Entity
public class TimeInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long timeInformationId;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private int workedHours;
    private int offHours;
    private int daysOff;
    private int overTime;
    private int extraDays;
    private LocalDate workPeriodStartDate;
    private LocalDate workPeriodEndDate;

    public TimeInformation(Employee employee, int workedHours, int offHours, int daysOff, int overTime, int extraDays, LocalDate workPeriodStartDate, LocalDate workPeriodEndDate) {
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

    public void setTimeInformationId(long timeInformationId) {
        this.timeInformationId = timeInformationId;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public void setOffHours(int offHours) {
        this.offHours = offHours;
    }

    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public void setExtraDays(int extraDays) {
        this.extraDays = extraDays;
    }

    public void setWorkPeriodStartDate(LocalDate workPeriodStartDate) {
        this.workPeriodStartDate = workPeriodStartDate;
    }

    public void setWorkPeriodEndDate(LocalDate workPeriodEndDate) {
        this.workPeriodEndDate = workPeriodEndDate;
    }
}
