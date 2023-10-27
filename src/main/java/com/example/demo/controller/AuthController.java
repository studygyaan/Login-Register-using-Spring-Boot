package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    UserService userService;

    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("user", new User());
        return "auth/register";
    }

    @PostMapping("/register")
    public String registerUser(Model model, @Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            model.addAttribute("errorMessage", "User not Registered!");
            model.addAttribute("bindingResult", bindingResult);
            return "auth/register";
        }
        List<Object> userPresentObj = userService.isUserPresent(user);
        if((Boolean) userPresentObj.get(0)){
            model.addAttribute("successMessage", userPresentObj.get(1));
            return "auth/register";
        }

        userService.saveUser(user);
        model.addAttribute("successMessage", "User registered successfully!");

        return "auth/login";
    }
}
