package com.microservice.post.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor//
public class Comment {//when you call that api i get the comment
    private String commentId;
    private String name;
    private String email;
    private String body;
    private String postId;

}
