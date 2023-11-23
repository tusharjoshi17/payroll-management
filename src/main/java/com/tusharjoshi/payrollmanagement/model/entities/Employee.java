package com.tusharjoshi.payrollmanagement.model.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;


@Getter
@Setter
@Entity
@Table(name = "employeeDetails")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(nullable = false)
    @NotBlank(message = "Personal Id is mandatory")
    @Size(min = 5, max = 5)
    private String personalId;
//    @Column(nullable = false)
    private String firstName;
    private String middleName;
//    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    @NotBlank(message = "Phone number is mandatory")
    @Size(min = 10, max = 10)
    private String phoneNumber;
    private String address;
    private String city;

    @Size(min = 6, max = 6)
    private Integer pinCode;
    private LocalDate dateOfBirth;
    private String qualification;
    private Integer currentExperience;
    private LocalDate startDate;
    private LocalDate endDate;

    public enum Gender{
        Male,
        Female
    }
    @Enumerated(EnumType.STRING)
    private Gender gender;
    public enum MaritalStatus{
        Married,
        Unmarried
    }
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

//    @OneToOne(mappedBy = "employee")
//    private SalaryInformation salaryInformation;
//
//    @OneToOne(mappedBy = "employee")
//    private WorkingHistory workingHistory;


    public Employee(String personalId, String firstName, String middleName, String lastName,
                    String phoneNumber, String city, String address, Long pinCode, String qualification,
                    Integer currentExperience, LocalDate dateOfBirth, LocalDate startDate, LocalDate endDate,
                    Gender gender, MaritalStatus maritalStatus, Department department) {
        this.personalId = personalId;
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

}
