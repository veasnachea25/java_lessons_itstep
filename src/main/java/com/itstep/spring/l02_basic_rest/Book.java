package com.itstep.spring.l02_basic_rest;

public class Book {
    private static int nextId = 1;
    private final int id = nextId++;
    private String author;
    private String title;
    private int price;

    public Book() {
    }

    public Book(String author, String title, int price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Book && id == ((Book) obj).id;
    }
}
