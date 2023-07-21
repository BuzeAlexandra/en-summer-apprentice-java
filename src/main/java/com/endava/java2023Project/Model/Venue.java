package com.endava.java2023Project.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Venue")
@Table(name = "Venue",schema ="dbo")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venueId")
    private Integer venueId;

    @Column(name ="location",length = 30)
    private String location;

    @Column(name ="type",length = 50)
    private String type;


    @Column(name ="capacity")
    private int capacity;



}
