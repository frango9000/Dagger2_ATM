package dev.dagger;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class Database {

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

        Account(String username) {
            this.username = username;
        }

        String username() {
            return username;
        }

        BigDecimal balance() {
            return balance;
        }

        public void deposit(BigDecimal bigDecimal) {
            this.balance = this.balance.add(bigDecimal);
        }
    }
}