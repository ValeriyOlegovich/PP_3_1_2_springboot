package com.example.PP_3_1_2_springboot.controller;

import com.example.PP_3_1_2_springboot.models.User;
import com.example.PP_3_1_2_springboot.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {


    private final UserServiceImp service;
    @Autowired
    public UserController(UserServiceImp service) {
        this.service = service;
    }

    @GetMapping(value = "/")
    public String users(Model model){
        model.addAttribute("users", service.listUsers());
        return "users";
    }
//сохранение юзера
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("user", new User());
        return "add";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("user") User user) {
        service.add(user);
        return "redirect:/";
    }

    @PutMapping("/update")
    public String update(@ModelAttribute("user") User user) {
        service.add(user);
        return "redirect:/";
    }

    // изменеие юзера
    @GetMapping("/find/{id}")
    public String find(@PathVariable( value = "id") long id, Model model) {
        model.addAttribute("user", service.getUserById(id));
        return "update";
    }
    // удаление юзера
    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") Long id){
        service.delete(id);
        return "redirect:/";
    }
}

