package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableDetailController {

    @GetMapping("/detail-table")
    public String detailTable(Model model) {
        // 테이블 헤더 정의
        List<String> headers = Arrays.asList("Column 1", "Column 2", "Column 3");

        // 테이블 데이터 정의
        List<List<String>> records = Arrays.asList(
            Arrays.asList("Row 1, Col 1", "Row 1, Col 2", "Row 1, Col 3"),
            Arrays.asList("Row 2, Col 1", "Row 2, Col 2", "Row 2, Col 3"),
            Arrays.asList("Row 3, Col 1", "Row 3, Col 2", "Row 3, Col 3")
        );

        // 모델에 데이터 추가
        model.addAttribute("headers", headers);
        model.addAttribute("records", records);

        // "dashboardTable.html" 템플릿 반환
        return "dashboardTable";
    }
}
