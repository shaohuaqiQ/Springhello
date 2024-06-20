package com.example.helloWorld.service;

import com.example.helloWorld.entity.EventData;
import java.util.List;
import java.util.Optional;

public interface EventDataService {
    List<EventData> getAllEventData();
    Optional<EventData> getEventDataById(Long id);
    EventData createEventData(EventData eventData);
    void deleteEventData(Long id);
}
