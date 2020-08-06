package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

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

    @Test
    public void withdrawFromAccountWithSufficientFunds() {
        a.deposit(100);
        a.withdraw(10);
        assertThat(a.getBalance()).isEqualTo(90);
    }


    @Test
    public void withdrawFromEmptyAccountNotAllowed() {
        try {
            a.withdraw(10);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }


}
