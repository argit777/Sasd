package com.itproger.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Annotation
@Controller
// Class
public class LoginController {

    @GetMapping("/welcome") public String welcome()
    {
        return "welcome.html";
    }

    @GetMapping("/admin") public String user()
    {
        return "admin.html";
    }

    @GetMapping("/basic") public String basic()
    {
        return "basic.html";
    }

    @GetMapping("/login") public String login()
    {
        return "login.html";
    }
}