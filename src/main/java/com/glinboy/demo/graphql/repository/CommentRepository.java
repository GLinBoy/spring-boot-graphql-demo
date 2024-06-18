package com.glinboy.demo.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glinboy.demo.graphql.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
