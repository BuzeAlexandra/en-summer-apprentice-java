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
@Entity(name="EventType")
@Table(name = "EventType",schema ="dbo")

public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventTypeId;

    @Column(name ="eventTypeName",length = 50)
    private String eventTypeName;

}
