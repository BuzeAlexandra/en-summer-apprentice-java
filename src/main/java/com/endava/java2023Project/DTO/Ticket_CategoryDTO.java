package com.endava.java2023Project.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket_CategoryDTO {

    private Integer ticketCategoryId;
    private String description;
    private int price;


}
