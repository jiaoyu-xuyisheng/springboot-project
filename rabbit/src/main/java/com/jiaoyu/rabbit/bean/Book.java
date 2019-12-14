package com.jiaoyu.rabbit.bean;

import java.io.Serializable;

public class Book implements Serializable {

    private String bookName;
    private String bookPublisher;

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }

    public Book(String bookName, String bookPublisher) {
        this.bookName = bookName;
        this.bookPublisher = bookPublisher;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
}
