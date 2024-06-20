package com.example.helloWorld.service.impl;

import com.example.helloWorld.entity.Analytics;
import com.example.helloWorld.repository.AnalyticsRepository;
import com.example.helloWorld.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AnalyticsServiceImpl implements AnalyticsService {

    @Autowired
    private AnalyticsRepository analyticsRepository;

    @Override
    public List<Analytics> getAllAnalytics() {
        return analyticsRepository.findAll();
    }

    @Override
    public Optional<Analytics> getAnalyticsById(Long id) {
        return analyticsRepository.findById(id);
    }

    @Override
    public Analytics createAnalytics(Analytics analytics) {
        return analyticsRepository.save(analytics);
    }

    @Override
    public void deleteAnalytics(Long id) {
        analyticsRepository.deleteById(id);
    }
}
