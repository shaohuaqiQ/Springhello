package com.example.helloWorld.controller;

import com.example.helloWorld.entity.EventDefinition;
import com.example.helloWorld.service.EventDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/eventDefinitions")
public class EventDefinitionController {

    @Autowired
    private EventDefinitionService eventDefinitionService;

    @GetMapping
    public String getAllEventDefinitions(Model model) {
        List<EventDefinition> eventDefinitions = eventDefinitionService.getAllEventDefinitions();
        model.addAttribute("eventDefinitions", eventDefinitions);
        return "eventDefinitions";  // 返回视图名称，对应eventDefinitions.html
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<EventDefinition> getEventDefinitionById(@PathVariable Long id) {
        Optional<EventDefinition> eventDefinition = eventDefinitionService.getEventDefinitionById(id);
        if (eventDefinition.isPresent()) {
            return ResponseEntity.ok(eventDefinition.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @ResponseBody
    public EventDefinition createEventDefinition(@RequestBody EventDefinition eventDefinition) {
        return eventDefinitionService.createEventDefinition(eventDefinition);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteEventDefinition(@PathVariable Long id) {
        eventDefinitionService.deleteEventDefinition(id);
        return ResponseEntity.noContent().build();
    }
}
