package com.endava.java2023Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name="Orders")
@Table(name = "Orders",schema ="dbo")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

   @ManyToOne
   @JoinColumn( name="userId")
    private Users userId;

    @ManyToOne
    @JoinColumn(name="ticketCategoryId")
    private TicketCategory ticketCategoryId;

    @Column(name ="orderedAt")
    private Date orderedAt;

    @Column(name ="numberOfTickets")
    private int numberOfTickets;

    @Column(name ="totalPrice")
    private int totalPrice;

}
