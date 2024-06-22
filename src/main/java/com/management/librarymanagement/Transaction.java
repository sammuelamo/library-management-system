package com.management.librarymanagement;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;

public class Transaction {
    private int transactionId;
    private int itemId;
    private int patronId;
    private LocalDate borrowDate;
    private LocalDate returnDate;


    public Transaction(int transactionId, int itemId, int patronId, LocalDate borrowDate, LocalDate returnDate) {
        this.transactionId = transactionId;
        this.itemId = itemId;
        this.patronId = patronId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;

    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getPatronId() {
        return patronId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void completeTransaction() {
        this.returnDate = LocalDate.now();
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(returnDate);
    }

    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", itemId=" + itemId + ", patronId=" + patronId
                + ", borrowDate=" + borrowDate + ", returnDate=" + returnDate + "]";
    }
}

