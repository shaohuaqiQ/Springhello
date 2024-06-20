package com.example.helloWorld.service;

import com.example.helloWorld.entity.EventDefinition;
import java.util.List;
import java.util.Optional;

public interface EventDefinitionService {
    List<EventDefinition> getAllEventDefinitions();
    Optional<EventDefinition> getEventDefinitionById(Long id);
    EventDefinition createEventDefinition(EventDefinition eventDefinition);
    void deleteEventDefinition(Long id);
}
