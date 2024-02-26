package com.example.starspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starspring.comment.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
