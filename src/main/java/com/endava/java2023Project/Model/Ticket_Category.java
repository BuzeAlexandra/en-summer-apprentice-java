package com.endava.java2023Project.Model;

import jakarta.persistence.*;

@Entity(name="Ticket_Category")
@Table(name = "Ticket_Category",schema ="dbo")

public class Ticket_Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticket_category_id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event_id;

    @Column(name ="description",length = 30)
    private String description;

     @Column(name ="price")
    private int price;

    public void setTicket_category_id(int ticket_category_id) {
        this.ticket_category_id = ticket_category_id;
    }

    public int getTicket_category_id() {
        return ticket_category_id;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEvent_id(Event event_id) {
        this.event_id = event_id;
    }
}
