package com.microservice.post.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.stream.events.Comment;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor//
public class PostDto {
    //what you want to return back
    //return back to postDetails
    private String postId;
    private String title;
    private String description;
    private String content;
    List<Comment> comments;//here return back list of comments
}
