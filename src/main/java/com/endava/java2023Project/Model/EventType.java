package com.endava.java2023Project.Model;

import jakarta.persistence.*;

@Entity(name="EventType")
@Table(name = "EventType",schema ="dbo")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int event_type_id;

    @Column(name ="event_type_name",length = 50)
    private String event_type_name;

    public void setEvent_type_id(int event_type_id) {
        this.event_type_id = event_type_id;
    }

    public int getEvent_type_id() {
        return event_type_id;
    }

    public String getEvent_type_name() {
        return event_type_name;
    }

    public void setEvent_type_name(String event_type_name) {
        this.event_type_name = event_type_name;
    }


}
