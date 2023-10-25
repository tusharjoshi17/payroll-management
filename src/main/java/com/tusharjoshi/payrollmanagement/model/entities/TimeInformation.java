package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class TimeInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long timeInformationId;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    @Getter
    private Employee employee;
    @Getter
    private int workedHours;
    @Getter
    private int offHours;
    @Getter
    private int daysOff;
    @Getter
    private int overTime;
    @Getter
    private int extraDays;
    @Getter
    private int workPeriodStartDay;
    @Getter
    private int workPeriodStartMonth;
    @Getter
    private int workPeriodStartYear;
    @Getter
    private int workPeriodEndDay;
    @Getter
    private int workPeriodEndMonth;
    @Getter
    private int workPeriodEndYear;

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

    public void setWorkPeriodStartDay(int workPeriodStartDay) {
        this.workPeriodStartDay = workPeriodStartDay;
    }

    public void setWorkPeriodStartMonth(int workPeriodStartMonth) {
        this.workPeriodStartMonth = workPeriodStartMonth;
    }

    public void setWorkPeriodStartYear(int workPeriodStartYear) {
        this.workPeriodStartYear = workPeriodStartYear;
    }

    public void setWorkPeriodEndDay(int workPeriodEndDay) {
        this.workPeriodEndDay = workPeriodEndDay;
    }

    public void setWorkPeriodEndMonth(int workPeriodEndMonth) {
        this.workPeriodEndMonth = workPeriodEndMonth;
    }

    public void setWorkPeriodEndYear(int workPeriodEndYear) {
        this.workPeriodEndYear = workPeriodEndYear;
    }
}
