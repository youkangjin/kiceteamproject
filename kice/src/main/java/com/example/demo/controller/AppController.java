package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    // MainDashboard
	@GetMapping("/dashboard/main")
    public String dashboardMain() {
        return "dashboardMain";
    }

    //DashboardDetail
    @GetMapping("/dashboard/detail")
    public String dashboardDetail() {
        return "dashboardDetail"; // Renders dashboardDetail.html
    }

    // School Detail
    @GetMapping("/statistics/detail")
    public String schoolDetail() {
        return "schoolDetail"; // Renders schoolDetail.html
    }

    // Statistics Page
    @GetMapping("/statistics")
    public String statistics() {
        return "statistics"; // Renders statistics.html
    }
}
