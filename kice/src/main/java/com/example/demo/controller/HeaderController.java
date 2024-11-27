package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.model.Actor;
import com.example.demo.service.ActorService;

@Controller
public class HeaderController {

    @Autowired
    private ActorService actorService;

    // 로그인 상태와 사용자 이름을 모든 템플릿에 추가
    @ModelAttribute
    public void addAttributes(Model model) {
        // 로그인 상태 확인 (예제: 세션 또는 JWT 활용)
        boolean isLoggedIn = actorService.isLoggedIn(); // 실제 로그인 확인 로직 필요
        model.addAttribute("isLoggedIn", isLoggedIn);

        // 사용자 이름 가져오기
        if (isLoggedIn) {
            String userName = actorService.getCurrentUserName(); // 현재 로그인 사용자 이름 가져오기
            model.addAttribute("userName", userName);
        }
    }
}