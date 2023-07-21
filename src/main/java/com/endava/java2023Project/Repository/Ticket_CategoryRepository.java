package com.endava.java2023Project.Repository;

import com.endava.java2023Project.Model.Ticket_Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Ticket_CategoryRepository extends JpaRepository<Ticket_Category, Integer> {
    List<Ticket_Category> findAllByEventId_EventId(Integer eventId);


}
