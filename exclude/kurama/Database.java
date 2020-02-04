package dev.kurama;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Database {

    private final Map<String, Account> accounts = new HashMap<>();

    @Inject
    Database() {
    }

    Account getAccount(String username) {
        return accounts.computeIfAbsent(username, Account::new);
    }

    static final class Account {

        private final String username;
        private BigDecimal balance = BigDecimal.ZERO;

        public Account(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public void deposit(BigDecimal bigDecimal) {
            this.balance= this.balance.add(bigDecimal);
        }
    }

}
