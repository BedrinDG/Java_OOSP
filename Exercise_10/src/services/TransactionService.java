package services;

import models.Account;

public class TransactionService {
    public boolean transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            System.out.println("Успешно переведено " + amount + " Руб с " + fromAccount.getAccountNumber() + " на " + toAccount.getAccountNumber());
            return true;
        } else {
            System.out.println("Недостаточно средств для перевода с " + fromAccount.getAccountNumber());
            return false;
        }
    }
}
