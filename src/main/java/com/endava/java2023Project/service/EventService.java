package com.endava.java2023Project.service;

import com.endava.java2023Project.dto.EventDTO;
import com.endava.java2023Project.dto.TicketCategoryDTO;
import com.endava.java2023Project.model.Event;
import com.endava.java2023Project.model.TicketCategory;
import com.endava.java2023Project.repository.EventRepository;
import com.endava.java2023Project.repository.TicketCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final TicketCategoryRepository ticketCategoryRepository;


    public EventService(EventRepository eventRepository, TicketCategoryRepository ticketCategoryRepository) {
        this.eventRepository = eventRepository;

        this.ticketCategoryRepository = ticketCategoryRepository;
    }

public List<EventDTO> findEventsByVenueIdAndEventTypeId(Integer venueId,String eventTypeId){
        List<Event> events = eventRepository.findAllByVenueId_VenueIdAndEventTypeId_EventTypeName(venueId,eventTypeId);
        List<EventDTO> newList = new ArrayList<>();
        for(Event e : events){
            EventDTO eventDTO = new EventDTO(e.getEventId(),e.getEventTypeId().getEventTypeName(),e.getVenueId(),e.getEventName(),e.getEventDescription(),e.getStartDate(),e.getEndDate());

                List<TicketCategory> ticketCat = ticketCategoryRepository.findAllByEventId_EventId(e.getEventId());
                List<TicketCategoryDTO> ticketCatDTO = new ArrayList<>();
                for(TicketCategory t : ticketCat){
                    TicketCategoryDTO ticketCategoryDTO = new TicketCategoryDTO(t.getDescription(),t.getPrice(),t.getTicketCategoryId());
                    ticketCatDTO.add(ticketCategoryDTO);
                }
                eventDTO.setTicketCategoryDTOList(ticketCatDTO);
                newList.add(eventDTO);

        }
        return newList;
}
}
