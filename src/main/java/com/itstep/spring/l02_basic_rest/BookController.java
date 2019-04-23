package com.itstep.spring.l02_basic_rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    List<Book> books = new ArrayList<Book>() {{
        add(new Book("Joan Rolling", "Harry Poster", 12));
        add(new Book("Arthur Conan Doyle", "12 Monkeys", 24));
    }};

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getBooks() {
        return books;
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @RequestMapping(value = "/book", method = RequestMethod.DELETE)
    public List<Book> deleteBook(@RequestParam(name = "id") int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                break;
            }
        }
        return books;
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public List<Book> deleteBookPath(@PathVariable("id") int id) {
        return this.deleteBook(id);
    }


}