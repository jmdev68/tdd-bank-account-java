package org.xpdojo.bank;

public class Account {
private int balance;

    public Account() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void  deposit(int amount) {
        if (amount > 0) {
            balance += amount ;
        }
    }

    public void withdraw(int amount) {
        if ((balance - amount) < 0) {
            throw new RuntimeException("Cannot withdraw - no overdraft available");
        } else {
            balance -= amount;
        }
    }
}
