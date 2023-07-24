package com.endava.java2023Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name="Users")
@Table(name = "Users",schema ="dbo")

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name ="userName",length=50)
    private String userName;

    @Column(name ="email",length=30)
    private String email;

}
