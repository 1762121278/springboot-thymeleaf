package com.offcn.demo.controller;

import com.offcn.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller

public class FourThymeleafController {

    @GetMapping("/four")
    public String first(Model model){
        String str="优就业";

        model.addAttribute("text",str);
        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");

        return "index4.html";
    }
}
