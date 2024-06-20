package com.example.helloWorld.controller;

import com.example.helloWorld.entity.Analytics;
import com.example.helloWorld.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/analytics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping
    public String getAllAnalytics(Model model) {
        List<Analytics> analyticsList = analyticsService.getAllAnalytics();
        model.addAttribute("analyticsList", analyticsList);
        return "analytics";  // 返回视图名称，对应analytics.html
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Analytics> getAnalyticsById(@PathVariable Long id) {
        Optional<Analytics> analytics = analyticsService.getAnalyticsById(id);
        if (analytics.isPresent()) {
            return ResponseEntity.ok(analytics.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @ResponseBody
    public Analytics createAnalytics(@RequestBody Analytics analytics) {
        return analyticsService.createAnalytics(analytics);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteAnalytics(@PathVariable Long id) {
        analyticsService.deleteAnalytics(id);
        return ResponseEntity.noContent().build();
    }
}
