package com.tusharjoshi.payrollmanagement.model.entities;
import jakarta.persistence.*;
import lombok.Getter;
import java.time.LocalDate;


@Entity
@Table(name = "employeeDetails")
public class Employee {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    @Getter
    private String PersonalId;
//    @Column(nullable = false)
    @Getter
    private String firstName;
    @Getter
    private String middleName;
//    @Column(nullable = false)
    @Getter
    private String lastName;

    @Getter
    private String phoneNumber;
    @Getter
    private String city;
    @Getter
    private String address;
    @Getter
    private long pinCode;
    @Getter
    private String qualification;
    @Getter
    private int currentExperience;
    @Getter
    private LocalDate dateOfBirth;
    @Getter
    private LocalDate startDate;
    @Getter
    private LocalDate endDate;
    public enum Gender{
        Male,
        Female
    }
    @Getter
    private Gender gender;
    public enum MaritalStatus{
        Married,
        Unmarried
    }
    @Getter
    private MaritalStatus maritalStatus;
    private boolean isMarried;
    private boolean isManager;

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setPersonalId(String personalId) {
        PersonalId = personalId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setCurrentExperience(int currentExperience) {
        this.currentExperience = currentExperience;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
