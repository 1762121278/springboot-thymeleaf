package com.offcn.demo.controller;

import com.offcn.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller

public class SecondThymeleafController {

    @GetMapping("/second")
    public String first(Model model){
        String message = "hello,优就业";

        User user = new User();
        user.setId(1);
        user.setName("shu");
        user.setAge(18);

        HashMap<String, String> map = new HashMap<>();
        map.put("src1","11.jpg");
        map.put("src2","22.jpg");

        model.addAttribute("user",user);
        model.addAttribute("src",map);
        model.addAttribute("message",message);

        return "index2.html";
    }
}
