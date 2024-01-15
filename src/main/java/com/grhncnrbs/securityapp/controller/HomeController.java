package com.grhncnrbs.securityapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//    @RequestMapping(method = RequestMethod.GET, value = "/")
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/signin")
    public String signin() {
        return "login";
    }

    @RequestMapping("/profile")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String profile() {
        return "profile";
    }

    @RequestMapping("/about")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String about() {
        return "about";
    }

}
