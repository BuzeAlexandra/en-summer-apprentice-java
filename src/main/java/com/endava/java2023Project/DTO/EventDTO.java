package com.endava.java2023Project.DTO;

import com.endava.java2023Project.Model.Ticket_Category;
import com.endava.java2023Project.Model.Venue;
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
    private Integer eventId;
   private String type;
   private String description;
   private String name;
   private Date startDate;
   private Date endDate;
   private Venue venue;
   private List<Ticket_CategoryDTO> ticketCategoryDTOList;

}
