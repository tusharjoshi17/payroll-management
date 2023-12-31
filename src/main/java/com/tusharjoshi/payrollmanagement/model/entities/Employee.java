package com.tusharjoshi.payrollmanagement.model.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
//    @NotBlank(message = "Phone number is mandatory", groups = {Employee.class}, payload = {})
    @NotBlank(message = "Phone number is mandatory")
    @Size(min = 10, max = 10, message = "Phone number should be 10 digits")
    private String phoneNumber;
    private String address;
    private String city;

    @Size(min = 6, max = 6, message = "Pin code should be 6 digits")
    private Integer pinCode;

    @Past(message = "Date of birth should be in past")
    private LocalDate dateOfBirth;
    private String qualification;
    private Integer currentExperience;

    @FutureOrPresent(message = "Start date should be in present or future")
    private LocalDate startDate;

    @Future(message = "End date should be in future")
    private LocalDate endDate;

    public enum Gender{
        Male,
        Female
    }
    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Gender is mandatory")
    private Gender gender;
    public enum MaritalStatus{
        Married,
        Unmarried
    }
    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Marital status is mandatory")
    private MaritalStatus maritalStatus;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    @OneToOne(mappedBy = "employee")
    private SalaryInformation salaryInformation;

    @OneToOne(mappedBy = "employee")
    private TimeInformation timeInformation;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<WorkingHistory> workingHistory;

//    @OneToOne(mappedBy = "employee")
//    private SalaryInformation salaryInformation;
//
//    @OneToOne(mappedBy = "employee")
//    private WorkingHistory workingHistory;


}
