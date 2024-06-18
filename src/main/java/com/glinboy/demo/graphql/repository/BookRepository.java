package com.glinboy.demo.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glinboy.demo.graphql.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
