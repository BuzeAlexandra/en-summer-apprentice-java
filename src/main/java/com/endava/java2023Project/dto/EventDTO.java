package com.endava.java2023Project.dto;

import com.endava.java2023Project.model.Venue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
    private int eventId;
   private String type;
   private String description;
   private String name;
   private Date startDate;
   private Date endDate;
   private Venue venue;
   private List<TicketCategoryDTO> ticketCategoryDTOList;

   public EventDTO(int eventId, String type, Venue venue, String name, String description, Date startDate, Date endDate) {
      this.eventId=eventId;
      this.type=type;
      this.venue = venue;
      this.name=name;
      this.description = description;
      this.startDate = startDate;
      this.endDate=endDate;

   }
}
