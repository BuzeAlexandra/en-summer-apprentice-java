package com.endava.java2023Project.Model;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Date;

@Entity(name="Orders")
@Table(name = "Orders",schema ="dbo")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

   @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user_id;

    @ManyToOne
    @JoinColumn(name = "ticket_category_id")
    private Ticket_Category ticket_category_id;

    @Column(name ="ordered_at")
    private Date ordered_at;
    @Column(name ="number_of_tickets")
    private int number_of_tickets;

    @Column(name ="total_price")
    private int total_price;

    public int getNumber_of_tickets() {
        return number_of_tickets;
    }

    public int getTotal_price() {
        return total_price;
    }

    public long getOrder_id() {
        return order_id;
    }



    public void setNumber_of_tickets(int number_of_tickets) {
        this.number_of_tickets = number_of_tickets;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }


    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setTicket_category_id(Ticket_Category ticket_category_id) {
        this.ticket_category_id = ticket_category_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public Ticket_Category getTicket_category_id() {
        return ticket_category_id;
    }

    public Users getUser_id() {
        return user_id;
    }

    public Date getOrdered_at() {
        return ordered_at;
    }

    public void setOrdered_at(Date ordered_at) {
        this.ordered_at = ordered_at;
    }

}
