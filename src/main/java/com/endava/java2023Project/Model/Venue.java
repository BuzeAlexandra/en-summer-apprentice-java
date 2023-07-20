package com.endava.java2023Project.Model;

import jakarta.persistence.*;

@Entity(name="Venue")
@Table(name = "Venue",schema ="dbo")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venue_id")
    private int venue_id;

    @Column(name ="location",length = 30)
    private String location;

    @Column(name ="type",length = 50)
    private String type;


    @Column(name ="capacity")
    private int capacity;


    public void setVenue_id(int venue_id) {
        this.venue_id = venue_id;
    }

    public int getVenue_id() {
        return venue_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }
}
