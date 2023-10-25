package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class SalaryInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long salaryId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    @Getter
    private Employee employee;
    @Getter
    private double monthlySalary;
    @Getter
    private double monthlyDeductions;
    @Getter
    private int salaryPeriodStartDay;
    @Getter
    private int salaryPeriodStartMonth;
    @Getter
    private int salaryPeriodStartYear;
    @Getter
    private int salaryPeriodEndDay;
    @Getter
    private int salaryPeriodEndMonth;
    @Getter
    private int salaryPeriodEndYear;


    public void setSalaryId(long salaryId) {
        this.salaryId = salaryId;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlyDeductions(double monthlyDeductions) {
        this.monthlyDeductions = monthlyDeductions;
    }

    public void setSalaryPeriodStartDay(int salaryPeriodStartDay) {
        this.salaryPeriodStartDay = salaryPeriodStartDay;
    }

    public void setSalaryPeriodStartMonth(int salaryPeriodStartMonth) {
        this.salaryPeriodStartMonth = salaryPeriodStartMonth;
    }

    public void setSalaryPeriodStartYear(int salaryPeriodStartYear) {
        this.salaryPeriodStartYear = salaryPeriodStartYear;
    }

    public void setSalaryPeriodEndDay(int salaryPeriodEndDay) {
        this.salaryPeriodEndDay = salaryPeriodEndDay;
    }

    public void setSalaryPeriodEndMonth(int salaryPeriodEndMonth) {
        this.salaryPeriodEndMonth = salaryPeriodEndMonth;
    }

    public void setSalaryPeriodEndYear(int salaryPeriodEndYear) {
        this.salaryPeriodEndYear = salaryPeriodEndYear;
    }


}
