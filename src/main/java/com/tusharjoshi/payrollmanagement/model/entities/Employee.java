package com.tusharjoshi.payrollmanagement.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "employeeDetails")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id_number")
    private long employeeId;
    private String PersonalId;
    private String firstName;
    private String middleName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String phoneNumber;
    private String city;
    private String address;
    private long pinCode;
    private String qualification;
    private int currentExperience;
    private int startDay;
    private int startMonth;
    private long startYear;
    private int endDay;
    private int endMonth;
    private long endYear;

    public enum Gender{
        Male,
        Female
    }
    private Gender gender;
    public enum MaritalStatus{
        Married,
        Unmarried
    }
    private MaritalStatus maritalStatus;
    private boolean isMarried;
    private boolean isManager;

}
