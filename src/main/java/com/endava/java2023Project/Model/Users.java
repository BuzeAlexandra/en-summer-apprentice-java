package com.endava.java2023Project.Model;

import jakarta.persistence.*;

@Entity(name="Users")
@Table(name = "Users",schema ="dbo")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(name ="user_name",length=50)
    private String user_name;

    @Column(name ="email",length=30)
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }
}
