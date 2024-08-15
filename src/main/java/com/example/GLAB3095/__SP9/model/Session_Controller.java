package com.example.GLAB3095.__SP9.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
class Session_Controller {

    @GetMapping("/dologin")
    public String doLogin(@ModelAttribute("u") User u, Model model) {
        model.addAttribute("FormVar", u);
        return "UserForm";
    }

    @PostMapping("/Getuser")
    public String userInfo(@ModelAttribute("u") User user, Model model) {
        System.out.println("Email: " + user.getEmail());
        System.out.println("First Name: " + user.getName());
        System.out.println("Id: " + user.getId());
        model.addAttribute("stu", user);
        return "showData";
    }
}
