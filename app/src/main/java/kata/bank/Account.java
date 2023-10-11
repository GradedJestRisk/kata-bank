package kata.bank;

import java.time.LocalDateTime;

public class Account {

    private int balance;
    private final Clock clock;

    public Account(int amount, Clock clock ) {
        this.balance = amount;
        this.clock = clock;
    }

    public void deposit(int amount){
        balance += amount;
    }
    public int balance(){
        return balance;
    }
    public LocalDateTime lastTransactionDate(){
        return clock.getTime();
    }

}
