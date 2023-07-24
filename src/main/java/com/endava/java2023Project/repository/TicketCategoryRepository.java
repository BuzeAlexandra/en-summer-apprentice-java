package com.endava.java2023Project.repository;

import com.endava.java2023Project.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
    List<TicketCategory> findAllByEventId_EventId(Integer eventId);


}
