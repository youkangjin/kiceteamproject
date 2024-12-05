package com.example.demo.repository;

import com.example.demo.model.GroupManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupManagementRepository extends JpaRepository<GroupManagement, Long> {
    // 추가 기능이 필요하면 정의 가능
}
