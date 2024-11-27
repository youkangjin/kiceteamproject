package com.example.demo.repository;

import com.example.demo.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

    // 사용자 ID로 Actor 검색
    Optional<Actor> findByA01Id(String a01_Id);
}
