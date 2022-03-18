package com.codingworld.liquibasedemo;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,Integer> {

}
