package com.agro.lk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/superadmin")
    public String showAdminIndex(){
        return "admin/index";
    }

    //add super admin


    @GetMapping("/addsuperadmin")
    public String addSuperAdmin(){
        return "admin/addSuperAdmin";
    }
}
