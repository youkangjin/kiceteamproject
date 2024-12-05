package com.example.demo.controller;

import com.example.demo.model.GroupManagement;
import com.example.demo.service.GroupManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GroupManagementController {

    @Autowired
    private GroupManagementService groupService;

    // 그룹 목록 조회
    @GetMapping
    public ResponseEntity<List<GroupManagement>> getAllGroups() {
        return ResponseEntity.ok(groupService.getAllGroups());
    }

    // 그룹 생성
    @PostMapping
    public ResponseEntity<GroupManagement> createGroup(@RequestBody GroupManagement group) {
        return ResponseEntity.ok(groupService.createGroup(group.getGroupName(), group.getDescription()));
    }

    // 그룹 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroup(@PathVariable Long id) {
        groupService.deleteGroup(id);
        return ResponseEntity.noContent().build();
    }

    // 그룹 수정
    @PutMapping("/{id}")
    public ResponseEntity<GroupManagement> updateGroup(
            @PathVariable Long id,
            @RequestBody GroupManagement updatedGroup) {
        return ResponseEntity.ok(
            groupService.updateGroup(id, updatedGroup.getGroupName(), updatedGroup.getDescription())
        );
    }
}
