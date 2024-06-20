package com.example.helloWorld.service.impl;

import com.example.helloWorld.entity.EventData;
import com.example.helloWorld.repository.EventDataRepository;
import com.example.helloWorld.service.EventDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventDataServiceImpl implements EventDataService {

    @Autowired
    private EventDataRepository eventDataRepository;

    @Override
    public List<EventData> getAllEventData() {
        return eventDataRepository.findAll();
    }

    @Override
    public Optional<EventData> getEventDataById(Long id) {
        return eventDataRepository.findById(id);
    }

    @Override
    public EventData createEventData(EventData eventData) {
        return eventDataRepository.save(eventData);
    }

    @Override
    public void deleteEventData(Long id) {
        eventDataRepository.deleteById(id);
    }
}
