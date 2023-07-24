package com.endava.java2023Project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Integer eventId;
    private Integer ticketCategoryId;
    private int numberOfTickets;
}


