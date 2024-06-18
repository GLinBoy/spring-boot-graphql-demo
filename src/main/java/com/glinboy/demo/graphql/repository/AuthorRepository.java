package com.glinboy.demo.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glinboy.demo.graphql.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
