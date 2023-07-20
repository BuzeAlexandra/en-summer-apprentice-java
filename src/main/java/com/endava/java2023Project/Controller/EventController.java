package com.endava.java2023Project.Controller;

import com.endava.java2023Project.Model.Event;
import com.endava.java2023Project.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    private final EventService eventService;


    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @GetMapping("/events")
    public String getEvents(){
       Event events = eventService.getEventByIdAndEventType(1);
       return events.toString();
    }



}
