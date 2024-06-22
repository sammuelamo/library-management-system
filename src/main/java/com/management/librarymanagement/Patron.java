package com.management.librarymanagement;

import java.util.LinkedList;
import java.util.Queue;

public class Patron {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String borrowedItems;
    private Queue<String> bookList;

    public Patron(int id, String name, String email, String phone, String address, String borrowedItems) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.borrowedItems = borrowedItems;
        this.bookList = new LinkedList<>();
    }

    public Queue<String> getBookList() {
        return bookList;
    }

    public void setBookList(Queue<String> bookList) {
        this.bookList = bookList;
    }

    public String getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(String borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


}