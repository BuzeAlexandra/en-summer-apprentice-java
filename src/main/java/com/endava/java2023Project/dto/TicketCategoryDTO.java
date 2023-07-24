package com.endava.java2023Project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TicketCategoryDTO {

    private int ticketCategoryId;
    private String description;
    private int price;


    public TicketCategoryDTO(String description, int price, Integer ticketCategoryId) {
        this.description = description;
        this.price=price;
        this.ticketCategoryId=ticketCategoryId;
    }
}
