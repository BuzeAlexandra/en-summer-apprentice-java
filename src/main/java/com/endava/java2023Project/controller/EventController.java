package com.endava.java2023Project.controller;

import com.endava.java2023Project.dto.EventDTO;
import com.endava.java2023Project.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    private final EventService eventService;
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @GetMapping("/api/events/{venueId}/{eventTypeId}")
    public List<EventDTO> getEvents(@PathVariable("venueId") Integer venueId, @PathVariable("eventTypeId") String eventTypeId){
        return eventService.findEventsByVenueIdAndEventTypeId(venueId,eventTypeId);


    }




}
