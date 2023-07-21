package com.endava.java2023Project.Service;

import com.endava.java2023Project.DTO.EventDTO;
import com.endava.java2023Project.DTO.Ticket_CategoryDTO;
import com.endava.java2023Project.Model.Event;
import com.endava.java2023Project.Model.Ticket_Category;
import com.endava.java2023Project.Repository.EventRepository;
import com.endava.java2023Project.Repository.Ticket_CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final Ticket_CategoryRepository ticketCategoryRepository;


    public EventService(EventRepository eventRepository, Ticket_CategoryRepository ticketCategoryRepository) {
        this.eventRepository = eventRepository;

        this.ticketCategoryRepository = ticketCategoryRepository;
    }

public List<EventDTO> findEventsByVenueIdAndEventTypeId(Integer venueId,String eventTypeId){
        List<Event> events = eventRepository.findAllByVenueId_VenueIdAndEventTypeId_EventTypeName(venueId,eventTypeId);
        List<EventDTO> newList = new ArrayList<>();
        for(Event e : events){
            EventDTO eventDTO = new EventDTO();
            eventDTO.setEventId(e.getEventId());
            eventDTO.setType(e.getEventTypeId().getEventTypeName());
            eventDTO.setVenue(e.getVenueId());
            eventDTO.setName(e.getEventName());
            eventDTO.setDescription(e.getEventDescription());
            eventDTO.setStartDate(e.getStartDate());
            eventDTO.setEndDate(e.getEndDate());


                List<Ticket_Category> ticketCat = ticketCategoryRepository.findAllByEventId_EventId(e.getEventId());
                List<Ticket_CategoryDTO> ticketCatDTO = new ArrayList<>();
                for(Ticket_Category t : ticketCat){
                    Ticket_CategoryDTO ticketCategoryDTO = new Ticket_CategoryDTO();
                    ticketCategoryDTO.setDescription(t.getDescription());
                    ticketCategoryDTO.setPrice(t.getPrice());
                    ticketCategoryDTO.setTicketCategoryId(t.getTicketCategoryId());
                    ticketCatDTO.add(ticketCategoryDTO);
                }
                eventDTO.setTicketCategoryDTOList(ticketCatDTO);
                newList.add(eventDTO);

        }
        return newList;
}
}
