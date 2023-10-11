package kata.bank;

import java.time.LocalDateTime;

public class Account {

    private int balance;

    public Account(int amount) {
        this.balance = amount;
    }

    public void deposit(int amount){
        balance += amount;
    }
    public int balance(){
        return balance;
    }
    public LocalDateTime lastTransactionDate(){
        return LocalDateTime.now();
    }

}
