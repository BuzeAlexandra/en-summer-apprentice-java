package com.endava.java2023Project.repository;

import com.endava.java2023Project.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

    public List<Event> findAllByVenueId_VenueIdAndEventTypeId_EventTypeName(Integer venueId,String eventTypeId);


}
