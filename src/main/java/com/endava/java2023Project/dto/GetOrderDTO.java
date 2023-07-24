package com.endava.java2023Project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class GetOrderDTO {
   private Integer eventId;
   private Date timestamp;
   private Integer ticketCategoryId;
   private int numberOfTickets;
   private long totalPrice;


}
