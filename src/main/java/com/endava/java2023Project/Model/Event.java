package com.endava.java2023Project.Model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Event")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Event",schema ="dbo")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventId;

    @ManyToOne
    @JoinColumn(name="venueId")
    private Venue venueId;

    @ManyToOne
    @JoinColumn(name="eventTypeId")
    private EventType eventTypeId;

    @Column(name = "eventDescription", length = 50)
    private String eventDescription;

    @Column(name = "eventName", length = 50)
    private String eventName;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;



}