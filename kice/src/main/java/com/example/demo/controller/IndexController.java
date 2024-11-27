package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Index 페이지
    @GetMapping("/index")
    public String indexPage() {
        return "index"; // Renders index.html
    }

    // Previous 페이지
    @GetMapping("/previous-page")
    public String previousPage() {
        return "previous"; // Renders previous.html
    }

    // Next 페이지
    @GetMapping("/next-page")
    public String nextPage() {
        return "next"; // Renders next.html
    }
}
