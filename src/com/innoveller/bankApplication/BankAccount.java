package com.innoveller.bankApplication;

import java.time.LocalDate;
import java.time.ZoneId;

public class BankAccount {
    private Long id;
    private int AccountNo;
    private String accountHolder;
    private BankAccountType accountType;
    private LocalDate openDate;
    public double balance;

    public BankAccount( Long id,int accountNo, String accountHolder, BankAccountType accountType, double balance) {
        this.id =id;
        AccountNo = accountNo;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
        this.openDate = LocalDate.now(ZoneId.systemDefault());
    }

    public Long getId() {
        return id;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

}
