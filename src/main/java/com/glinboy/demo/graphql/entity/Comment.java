package com.glinboy.demo.graphql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Comment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;

    @Column(length = 128, nullable = false)
    private String fullname;
    
    @Column(length = 128, nullable = false)
    private String email;

    @Column(length = 512, nullable = false)
    private String content;
    
    @Column(nullable = false)
    private Integer rate;
}
