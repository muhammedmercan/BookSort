package com.educodes.booksort;


public class Book {

    private String bookPrice;
    private String publishingHouse;


    public Book(String bookPrice, String publishingHouse) {
        this.bookPrice = bookPrice;
        this.publishingHouse = publishingHouse;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
