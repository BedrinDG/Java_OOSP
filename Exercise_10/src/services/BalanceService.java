package services;

import models.Account;

public class BalanceService {
    public void checkBalance(Account account) {
        System.out.println("Баланс на счете " + account.getAccountNumber() + ": " + account.getBalance() + " Руб");
    }
}