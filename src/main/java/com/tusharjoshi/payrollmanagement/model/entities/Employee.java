package com.tusharjoshi.payrollmanagement.model.entities;
import jakarta.persistence.*;
import lombok.Getter;
import java.time.LocalDate;


@Getter
@Entity
@Table(name = "employeeDetails")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    private String PersonalId;
//    @Column(nullable = false)
    private String firstName;
    private String middleName;
//    @Column(nullable = false)
    private String lastName;

    private String phoneNumber;
    private String city;
    private String address;
    private long pinCode;
    private String qualification;
    private int currentExperience;
    private LocalDate dateOfBirth;
    private LocalDate startDate;
    private LocalDate endDate;

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

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

//    @OneToOne(mappedBy = "employee")
//    private SalaryInformation salaryInformation;
//
//    @OneToOne(mappedBy = "employee")
//    private WorkingHistory workingHistory;


    public Employee(String PersonalId, String firstName, String middleName, String lastName,
                    String phoneNumber, String city, String address, long pinCode, String qualification,
                    int currentExperience, LocalDate dateOfBirth, LocalDate startDate, LocalDate endDate,
                    Gender gender, MaritalStatus maritalStatus, Department department) {
        this.PersonalId = PersonalId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.address = address;
        this.pinCode = pinCode;
        this.qualification = qualification;
        this.currentExperience = currentExperience;
        this.dateOfBirth = dateOfBirth;
        this.startDate = startDate;
        this.endDate = endDate;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.department = department;
    }

    public Employee() {
    }


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

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
