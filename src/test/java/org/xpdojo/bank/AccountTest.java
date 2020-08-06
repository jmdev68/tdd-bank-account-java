package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void checkNewAccountBalanceIsZero() {
        Account a = new Account();
        assertThat(a.getBalance()).isZero();
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account b = new Account();
        b.deposit(10);

        assertThat(b.getBalance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleAmountsToIncreaseTheBalance() {
        Account b = new Account();
        b.deposit(10);
        b.deposit(20);

        assertThat(b.getBalance()).isEqualTo(30);
    }


    @Test
    public void depositAmountShallNotBeNegative() {
        Account b = new Account();
        b.deposit(-10);

        assertThat(b.getBalance()).isEqualTo(0);
    }



}
