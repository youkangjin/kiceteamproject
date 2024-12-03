package com.example.demo.service;

import com.example.demo.model.GroupManagement;
import com.example.demo.repository.GroupManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupManagementService {

    @Autowired
    private GroupManagementRepository groupRepository;

    // 모든 그룹 조회
    public List<GroupManagement> getAllGroups() {
        return groupRepository.findAll();
    }

    // 그룹 생성
    public GroupManagement createGroup(String groupName, String description) {
        GroupManagement group = new GroupManagement();
        group.setGroupName(groupName);
        group.setDescription(description);
        return groupRepository.save(group);
    }

    // 그룹 삭제
    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }

    // 그룹 수정
    public GroupManagement updateGroup(Long id, String newGroupName, String newDescription) {
        GroupManagement group = groupRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Group not found"));
        group.setGroupName(newGroupName);
        group.setDescription(newDescription);
        return groupRepository.save(group);
    }
}
