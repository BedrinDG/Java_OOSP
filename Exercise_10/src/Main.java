import facade.BankingFacade;
import models.Account;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Первый", 1000.0);
        Account account2 = new Account("Второй", 500.0);
        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.checkBalance(account1);
        bankingFacade.checkBalance(account2);
        bankingFacade.deposit(account1, 200.0);
        bankingFacade.transfer(account1, account2, 300.0);
        bankingFacade.checkBalance(account1);
        bankingFacade.checkBalance(account2);
    }
}