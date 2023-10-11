package kata.bank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

@DisplayName("Account unit test")
class AccountTest {
    @Nested
    @DisplayName("#balance")
    class balance {
        @DisplayName("if balance is zero and a 1000 deposit is made, should return 1000")
        @Test void shouldReturn1000() {
            // given
            Account account = new Account(0);
            int amount = 1000;

            // when
            account.deposit(amount);

            // then
            int balance = account.balance();
            assertThat(balance).isEqualTo(1000);
        }
        @DisplayName("if balance is zero and a 2000 deposit is made, should return 2000")
        @Test void shouldReturn2000() {
            // given
            Account account = new Account(0);
            int amount = 2000;

            // when
            account.deposit(amount);

            // then
            int balance = account.balance();
            assertThat(balance).isEqualTo(2000);
        }
    }

    @Nested
    @DisplayName("#Account")
    class account {
        @DisplayName("if account is created with 1000, should return 1000 as balance")
        @Test void shouldReturn1000() {
            // given
            int amount = 1000;

            // when
            Account account = new Account(amount);

            // then
            int balance = account.balance();
            assertThat(balance).isEqualTo(1000);
        }
        @DisplayName("if account is created with 1000, and a 1000 deposit is made, should return 2000 as balance")
        @Test void shouldReturn2000() {
            // given
            int amount = 1000;
            Account account = new Account(amount);

            // when
            account.deposit(1000);

            // then
            int balance = account.balance();
            assertThat(balance).isEqualTo(2000);
        }
    }

}
