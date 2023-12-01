package com.tusharjoshi.payrollmanagement.controller;


import com.tusharjoshi.payrollmanagement.model.entities.User;
import com.tusharjoshi.payrollmanagement.service.UserDetailsServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    private final UserDetailsServiceImpl userDetailsService;

    @Autowired
    public RegistrationController(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }

//    @PostMapping("/register")
//    public String processRegistrationForm(@ModelAttribute("user") User user){
////        Implement logic to validate user input, save user to the database, and handle success/failure
//        // Redirect to the login page or show a success message based on the outcome.
//        userDetailsService.registerUser(user);
//        return "redirect:/login";
//    }

    @PostMapping("/register")
    public String processRegistrationForm(
            @ModelAttribute("User") @Valid User user,
            BindingResult result,
            Model model) {
//        validate user input
        if(result.hasErrors()){
            return "registration";
        }
//        implement logic to save user to the database
        try{
            userDetailsService.registerUser(user);
        }   catch (Exception e){
//            Handle registration failure, redirect to an error page or display an error message
            model.addAttribute("error", "Registration failed. Please try again.");
            return "error"; //create and error.html template
        }
        //Registration success, redirect to the login page or show a success message
        return "redirect:/login?success";
    }
}
