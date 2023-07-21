package com.endava.java2023Project.Model;

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

public class Ticket_Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketCategoryId;

    @ManyToOne
    @JoinColumn(name="eventId")
    private Event eventId;

    @Column(name ="description",length = 30)
    private String description;

     @Column(name ="price")
    private int price;



}
