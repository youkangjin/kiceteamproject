package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class DashboardController {

    // 기본 대시보드 페이지
    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        List<Record> records = Arrays.asList(
            new Record("Record 1", 45),
            new Record("Record 2", 70),
            new Record("Record 3", 30)
        );

        model.addAttribute("records", records);
        return "dashboardMain"; // dashboard.html 렌더링
    }

    // 테이블 데이터 페이지
    @GetMapping("/dashboard/table")
    public String dashboardTable(Model model) {
        List<String> headers = Arrays.asList("Column 1", "Column 2", "Column 3");
        List<List<String>> records = Arrays.asList(
            Arrays.asList("Row 1, Col 1", "Row 1, Col 2", "Row 1, Col 3"),
            Arrays.asList("Row 2, Col 1", "Row 2, Col 2", "Row 2, Col 3")
        );

        model.addAttribute("headers", headers);
        model.addAttribute("records", records);
        return "dashboardTable"; // dashboardTable.html 렌더링
    }

    // 내부 클래스: Record 데이터 모델
    public static class Record {
        private String name;
        private int percentage;

        public Record(String name, int percentage) {
            this.name = name;
            this.percentage = percentage;
        }

        public String getName() {
            return name;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
