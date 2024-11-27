package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // 로그인 페이지
    @GetMapping("/login")
    public String loginPage(Model model) {
        // 필요 시 로그인 관련 메시지 추가 가능
        return "login"; // login.html 템플릿 반환
    }

    // 로그아웃 처리
    @GetMapping("/logout")
    public String logout() {
        // Spring Security의 로그아웃 처리 이후 로그인 페이지로 리다이렉트
        return "redirect:/login";
    }
}
