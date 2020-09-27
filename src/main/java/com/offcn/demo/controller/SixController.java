package com.offcn.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SixController {

    @GetMapping("/six")
    public String first(Model model) {

        return "index6";
    }
}