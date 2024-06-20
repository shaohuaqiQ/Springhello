package com.example.helloWorld.service;

import com.example.helloWorld.entity.Analytics;
import java.util.List;
import java.util.Optional;

public interface AnalyticsService {
    List<Analytics> getAllAnalytics();
    Optional<Analytics> getAnalyticsById(Long id);
    Analytics createAnalytics(Analytics analytics);
    void deleteAnalytics(Long id);
}
