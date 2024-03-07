package com.blog.blogappapis.payloads;

import com.blog.blogappapis.entities.Category;
import com.blog.blogappapis.entities.Comment;
import com.blog.blogappapis.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PostDto {

    private Integer postId;
    private String title;
    private String content;
    private String imageName;
    private Date addedDate;
    private CategoryDto category;
    private UserDto user;

    private Set<CommentDto> comments = new HashSet<>();

}
