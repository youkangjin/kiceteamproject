package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DetailController {

    @GetMapping("/detail")
    public String detailPage(@RequestParam(required = false) String id, Model model) {
        // 예제 데이터
        Item item = new Item("Sample Title", "Sample Description");
        model.addAttribute("item", item);

        // 추가적으로 id를 기반으로 데이터 로직을 작성할 수 있습니다.
        if (id != null) {
            // 예제: id에 따라 제목 변경
            item.setTitle("Title for ID: " + id);
            item.setDescription("Description for ID: " + id);
        }

        return "detail"; // detail.html 템플릿 렌더링
    }

    // 데이터 모델
    public static class Item {
        private String title;
        private String description;

        public Item(String title, String description) {
            this.title = title;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
