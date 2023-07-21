package com.endava.java2023Project.DTO;

import com.endava.java2023Project.Model.Ticket_Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Integer eventId;
    private Integer ticketCategoryId;
    private int numberOfTickets;
}


