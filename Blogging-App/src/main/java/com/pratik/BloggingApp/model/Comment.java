package com.pratik.BloggingApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private String commentContent;

    @ManyToOne
    @JoinColumn(name = "blogpost_id")
    private Post blogPost;

    @ManyToOne
    @JoinColumn(name = "commenter_id")
    private User commenter;

}
