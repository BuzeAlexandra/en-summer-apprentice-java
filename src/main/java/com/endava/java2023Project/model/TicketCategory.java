package com.endava.java2023Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


@Entity(name="Ticket_Category")
@Table(name = "Ticket_Category",schema ="dbo")

public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketCategoryId;

    @ManyToOne
    @JoinColumn(name="eventId")
    private Event eventId;

    @Column(name ="description",length = 30)
    private String description;

     @Column(name ="price")
    private int price;

}
