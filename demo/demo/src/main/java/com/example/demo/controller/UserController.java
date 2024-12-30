package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Display list of users
    @GetMapping("/")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "user_list";
    }

    // Show form for creating a new user
    @GetMapping("/new")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user_form";
    }

    // Save a new user
    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user) {
        userRepository.save(user);
        return "redirect:/users/";
    }

    // Show form to edit an existing user
    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable Long id, Model model) {
        model.addAttribute("user", userRepository.findById(id).orElse(new User()));
        return "user_form";
    }

    // Delete a user
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "redirect:/users/";
    }
}
