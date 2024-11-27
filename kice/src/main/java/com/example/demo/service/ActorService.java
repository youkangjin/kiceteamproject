package com.example.demo.service;

import com.example.demo.model.Actor;
import com.example.demo.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    public Actor saveActor(Actor actor) {
        return actorRepository.save(actor);
    }
    public boolean isLoggedIn() {
        // 실제 로그인 상태 확인 로직 (예: 세션 또는 JWT 검증)
        // 현재는 예제로 항상 true 반환
        return true;
    }

    // 현재 로그인한 사용자 이름 가져오기
    public String getCurrentUserName() {
        // 실제 사용자 정보 가져오기 로직 (예: 세션 또는 JWT 활용)
        // 현재는 예제로 "홍길동" 반환
        return "admin";
    }
}
