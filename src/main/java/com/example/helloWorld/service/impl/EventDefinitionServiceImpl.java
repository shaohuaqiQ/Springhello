package com.example.helloWorld.service.impl;

import com.example.helloWorld.entity.EventDefinition;
import com.example.helloWorld.repository.EventDefinitionRepository;
import com.example.helloWorld.service.EventDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventDefinitionServiceImpl implements EventDefinitionService {

    @Autowired
    private EventDefinitionRepository eventDefinitionRepository;

    @Override
    public List<EventDefinition> getAllEventDefinitions() {
        return eventDefinitionRepository.findAll();
    }

    @Override
    public Optional<EventDefinition> getEventDefinitionById(Long id) {
        return eventDefinitionRepository.findById(id);
    }

    @Override
    public EventDefinition createEventDefinition(EventDefinition eventDefinition) {
        return eventDefinitionRepository.save(eventDefinition);
    }

    @Override
    public void deleteEventDefinition(Long id) {
        eventDefinitionRepository.deleteById(id);
    }
}
