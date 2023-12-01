package com.tusharjoshi.payrollmanagement.controller;

import com.tusharjoshi.payrollmanagement.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final UserDetailsServiceImpl userDetailsService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public LoginController(UserDetailsServiceImpl userDetailsService, PasswordEncoder passwordEncoder) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }
    @GetMapping("/login")
    public String showLoginForm(){
        return "login";
    }

    @PostMapping("/login")
    public String processLoginForm(
            @RequestParam String email,
            @RequestParam String password,
            Model model) {
        // Implement logic to authenticate the user based on email and password
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(email);
            // Compare the provided password with the one stored in userDetails
            if (passwordEncoder.matches(password, userDetails.getPassword())) {
                // Authentication success, redirect to the home page or any secured page
                return "redirect:/secure/home";
            } else {
                // Incorrect password, show an error message
                model.addAttribute("error", "Invalid email or password");
                return "login";
            }
        } catch (UsernameNotFoundException e) {
            // User not found, show an error message
            model.addAttribute("error", "User not found");
            return "login";
        } catch (BadCredentialsException e) {
            // Incorrect password, show an error message
            model.addAttribute("error", "Incorrect password");
            return "login";
        }

    }
}
