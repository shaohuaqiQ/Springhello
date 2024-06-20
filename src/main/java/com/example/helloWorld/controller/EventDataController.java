package com.example.helloWorld.controller;

import com.example.helloWorld.entity.EventData;
import com.example.helloWorld.service.EventDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/eventData")
public class EventDataController {

    @Autowired
    private EventDataService eventDataService;

    @GetMapping
    public String getAllEventData(Model model) {
        List<EventData> eventDataList = eventDataService.getAllEventData();
        model.addAttribute("eventDataList", eventDataList);
        return "eventData";  // 返回视图名称，对应eventData.html
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<EventData> getEventDataById(@PathVariable Long id) {
        Optional<EventData> eventData = eventDataService.getEventDataById(id);
        if (eventData.isPresent()) {
            return ResponseEntity.ok(eventData.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @ResponseBody
    public EventData createEventData(@RequestBody EventData eventData) {
        return eventDataService.createEventData(eventData);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteEventData(@PathVariable Long id) {
        eventDataService.deleteEventData(id);
        return ResponseEntity.noContent().build();
    }
}
