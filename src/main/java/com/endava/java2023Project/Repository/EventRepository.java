package com.endava.java2023Project.Repository;

import com.endava.java2023Project.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {
    //List<Event> findByVenueIdAndType(long venue_id, String event_type_name);\
    //List<Event> findByVenue_idAndAndEvent_type_id(int venue_id, int event_type_id);
    Event findByEvent_id(int id);

}
