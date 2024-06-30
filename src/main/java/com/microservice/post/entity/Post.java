package com.microservice.post.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "posts")
public class Post {
    @Id
    private String id;
    private String title;
    private String description;
    private String content;
}
