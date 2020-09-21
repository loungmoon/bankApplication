package com.innoveller.bankApplication;

import java.util.List;

public interface BankService {
    BankAccount findAccount(Long id);
    BankAccount createAccount(String accountHolder,BankAccountType accountType, double balance);
    void deposit(BankAccount account,double amount);
    void withdraw(BankAccount account,double amount);
    void transfer(BankAccount fromAccount,BankAccount toAccount,double amount);
    List<Transaction> getAccountTransaction(BankAccount account);
}
