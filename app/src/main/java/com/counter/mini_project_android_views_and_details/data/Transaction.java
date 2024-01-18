package com.counter.mini_project_android_views_and_details.data;

import java.io.Serializable;

public class Transaction implements Serializable {
    private int id, account;
    public  String date;
    public double amount, balance;
    private  type type;

    public Transaction(int id, int account, String date, double amount, double balance, type type) {
        this.id = id;
        this.account = account;
        this.date = date;
        this.amount = amount;
        this.balance = balance;
        this.type = type;
    }



    public int getId() {
        return id;
    }

    public int getAccount() {
        return account;
    }

    public  String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
    public type getType(){ return type;}

}
