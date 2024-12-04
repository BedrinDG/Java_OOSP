package facade;

import models.Account;
import services.*;

public class BankingFacade {
    private BalanceService balanceService;
    private TransactionService transactionService;

    public BankingFacade() {
        this.balanceService = new BalanceService();
        this.transactionService = new TransactionService();
    }

    public void checkBalance(Account account) {
        balanceService.checkBalance(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
        System.out.println("Успешно пополнено " + amount + " Руб на счет " + account.getAccountNumber());
    }

    public void transfer(Account fromAccount, Account toAccount, double amount) {
        transactionService.transfer(fromAccount, toAccount, amount);
    }
}