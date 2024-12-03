package com.example.demo.controller;

import com.example.demo.model.GroupManagement;
import com.example.demo.service.GroupManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GroupManagementController {

    @Autowired
    private GroupManagementService groupService;

    // 그룹 목록 조회
    @GetMapping
    public List<GroupManagement> getAllGroups() {
        return groupService.getAllGroups();
    }

    // 그룹 생성
    @PostMapping
    public GroupManagement createGroup(@RequestBody GroupManagement group) {
        return groupService.createGroup(group.getGroupName(), group.getDescription());
    }

    // 그룹 삭제
    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable Long id) {
        groupService.deleteGroup(id);
    }

    // 그룹 수정
    @PutMapping("/{id}")
    public GroupManagement updateGroup(
            @PathVariable Long id,
            @RequestBody GroupManagement updatedGroup) {
        return groupService.updateGroup(id, updatedGroup.getGroupName(), updatedGroup.getDescription());
    }
}
