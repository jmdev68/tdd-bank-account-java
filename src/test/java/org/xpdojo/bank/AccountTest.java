package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private final Account a = new Account();

    @Test
    public void checkNewAccountBalanceIsZero() {
        assertThat(a.getBalance()).isZero();
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        a.deposit(10);

        assertThat(a.getBalance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleAmountsToIncreaseTheBalance() {
        a.deposit(10);
        a.deposit(20);

        assertThat(a.getBalance()).isEqualTo(30);
    }


    @Test
    public void depositAmountShallNotBeNegative() {
        a.deposit(-10);

        assertThat(a.getBalance()).isEqualTo(0);
    }




}
