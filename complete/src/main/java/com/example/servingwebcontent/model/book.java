package com.example.servingwebcontent.model;

class Book {
    String title;
    String author;
    int numPage;

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.numPage = page;
    };

    public void BookQuantity(double num) {
        System.out.println("test number:" + num);

    }
};