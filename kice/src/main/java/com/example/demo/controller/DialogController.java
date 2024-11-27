package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DialogController {

    @GetMapping("/dialog")
    public String dialogPage(Model model) {
        // 대화 상자의 제목과 내용을 설정
        model.addAttribute("dialogTitle", "Example Dialog");
        model.addAttribute("dialogContent", "This is a dialog example content.");
        return "dialogPage"; // dialogPage.html 템플릿 반환
    }
}
