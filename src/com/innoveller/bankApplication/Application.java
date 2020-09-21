package com.innoveller.bankApplication;

import java.util.List;

public class Application {
    public static void main(String[] args) {
       BankService service = new BankServiceImplement();

       BankAccount dawHla = service.createAccount("Daw Hla",BankAccountType.DEPOSIT,100);
       BankAccount uTun   = service.createAccount("U Tun",BankAccountType.SAVING,100);


       service.deposit(dawHla,100);
       service.withdraw(dawHla,10);
       service.transfer(dawHla,uTun,50);

        List<Transaction> transactions = service.getAccountTransaction(dawHla);

        for(Transaction transaction:transactions){
            System.out.println(transaction.getTransactionType() + " Amount "+transaction.getAmount()+" At Date"+transaction.getTransactionDate());
        }

        BankAccount account = service.findAccount(1L);
        {
            System.out.println("Id :"+account.getId()+" AccountNo :" + account.getAccountNo()+" Account Holder :"+account.getAccountHolder()+" Balance :"+account.balance+" At Date"+account.getOpenDate());
        }
    }
}
