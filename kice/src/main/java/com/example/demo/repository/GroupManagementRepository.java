package com.example.demo.repository;

import com.example.demo.model.GroupManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupManagementRepository extends JpaRepository<GroupManagement, Long> {
    // 필요시 사용자 정의 메서드 추가 가능
}