package com.endava.java2023Project.Service;

import com.endava.java2023Project.Model.Event;
import com.endava.java2023Project.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;


    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event getEventByIdAndEventType(int id){
    return eventRepository.findByEvent_id(id);

    }
}
