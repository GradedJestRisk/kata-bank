package kata.bank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class AccountTest {
    @Nested
    @DisplayName("balance()")
    class deposit {
        @DisplayName("if balance is zero and a 1000 deposit is made, should return 1000")
        @Test void appHasAGreeting() {
            // given
            Account account = new Account(0);

            // when
            account.deposit(1000);

            // then
            int balance = account.balance();
            assertThat(balance).isEqualTo(1000);
        }
    }

}
