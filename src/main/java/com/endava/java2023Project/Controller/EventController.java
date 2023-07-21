package com.endava.java2023Project.Controller;

import com.endava.java2023Project.DTO.EventDTO;
import com.endava.java2023Project.Model.Event;
import com.endava.java2023Project.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    List<EventDTO> events = eventService.findEventsByVenueIdAndEventTypeId(venueId,eventTypeId);
            return events;
    }




}
