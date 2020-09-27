package com.offcn.demo.controller;

import com.offcn.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller

public class ThirdThymeleafController {

    @GetMapping("/third")
    public String first(Model model){

        User user1 = new User();
        user1.setId(1);
        user1.setName("shu");
        user1.setAge(18);

        User user2 = new User();
        user2.setId(2);
        user2.setName("WCW");
        user2.setAge(18);

        ArrayList<Object> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);

        model.addAttribute("userList",list);


        return "index3.html";
    }
}
