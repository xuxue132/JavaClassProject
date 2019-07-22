package ATM;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Account2 extends Account1 implements Serializable {
    private String password;
    private String name;
    private ArrayList<Transaction> transaction=new ArrayList<Transaction>();;

    public Account2() {
    }

    public Account2(int id, double balance, String name) {
        super(id, balance);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void WithDraw(int money1) {
        setBalance(getBalance() - money1);
        Transaction tempT1 = new Transaction('W', money1, getBalance(), "withdraw " + money1);
        transaction.add(tempT1);
    }

    public void deposit(int money2) {
        setBalance(getBalance() + money2);
        Transaction tempT2 = new Transaction('D', money2, getBalance(), "deposit " + money2);
        transaction.add(tempT2);
    }

    ArrayList<Transaction> getTransation() {
        return transaction;
    }
}

class Transaction{
    private java.util.Date date;
    private char type;//'W'表示取款，‘D’表示存款
    private double amount;//交易量
    private double balance;//交易后的新的余款
    private String description;//交易描述

    public Transaction(char type, double amount, double balance, String description) {
        date=new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public String toString(){
        return "The type is "+type+" : "+description+" /The new balance is : "+balance+ " / operate time " + date.toString();
    }
}