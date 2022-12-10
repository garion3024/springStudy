package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Long id;

    public String name;

    public String email;

    public String password;

    public LocalDateTime created_at;

    public LocalDateTime updated_at;
}
