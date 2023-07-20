package com.endava.java2023Project.Model;

import java.util.Date;

import jakarta.persistence.*;

@Entity(name="Event")
@Table(name = "Event",schema ="dbo")
public class Event {

    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int event_id;

  @ManyToOne
  @JoinColumn(name = "venue_id")
  private Venue venue_id;

  @ManyToOne
  @JoinColumn(name = "event_type_id")
  private EventType event_type_id;

  @Column(name ="event_description",length = 50)
    private String event_description;

    @Column(name ="event_name",length = 50)
    private String event_name;

    @Column(name ="start_date")
    private Date start_date;

    @Column(name ="end_date")
    private Date end_date;



  //setters and getters


  public void setEvent_id(int event_id) {
    this.event_id = event_id;
  }

  public int getEvent_id() {
    return event_id;
  }

  public String getEvent_description() {
    return event_description;
  }

  public void setEvent_description(String event_description) {
    this.event_description = event_description;
  }

  public String getEvent_name() {
    return event_name;
  }

  public void setEvent_name(String event_name) {
    this.event_name = event_name;
  }

  public void setVenue_id(Venue venue_id) {
    this.venue_id = venue_id;
  }

  public Venue getVenue_id() {
    return venue_id;
  }

  public Date getEnd_date() {
    return end_date;
  }

  public Date getStart_date() {
    return start_date;
  }

  public void setEvent_type_id(EventType event_type_id) {
    this.event_type_id = event_type_id;
  }

  public EventType getEvent_type_id() {
    return event_type_id;
  }

  public void setEnd_date(Date end_date) {
    this.end_date = end_date;
  }

  public void setStart_date(Date start_date) {
    this.start_date = start_date;
  }
}
