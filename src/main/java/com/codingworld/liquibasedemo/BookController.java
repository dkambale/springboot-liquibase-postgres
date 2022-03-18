package com.codingworld.liquibasedemo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codingworld")
public class BookController {

  @Autowired
  BookRepository bookRepository;

  @GetMapping("/sayhello")
  public String sayHello(){
    return "Hello from Coding World";
  }

  @GetMapping("/getbooks")
  public List<Book> getAllBooks() {
    List<Book> books= (List<Book>) bookRepository.findAll();
    return books;
  }
}
