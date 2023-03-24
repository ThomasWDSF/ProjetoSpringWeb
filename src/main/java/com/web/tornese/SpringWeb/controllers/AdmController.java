package com.web.tornese.SpringWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdmController {
    
    @GetMapping("/admin")
    public String index(){
        return "admin/index";
    }

}
