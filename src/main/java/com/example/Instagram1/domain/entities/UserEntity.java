package com.example.Instagram1.domain.entities;

import jakarta.persistence.Table;

@Table(name="users")

public class UserEntity {
    private Long id;
    private String name;
    private String lastname;
    private String username;
    private String password;
    
}
