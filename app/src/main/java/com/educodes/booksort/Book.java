package com.educodes.booksort;

import android.graphics.drawable.Drawable;

public class Book {

    private String bookPrice;
    private Drawable publishingHouse;


    public Book(String bookPrice, Drawable publishingHouse) {
        this.bookPrice = bookPrice;
        this.publishingHouse = publishingHouse;
    }

    public String getBookName() {
        return bookPrice;
    }

    public void setBookName(String bookName) {
        this.bookPrice = bookName;
    }

    public Drawable getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(Drawable publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
