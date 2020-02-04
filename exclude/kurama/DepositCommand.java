package dev.kurama;

import dev.kurama.Database.Account;
import java.math.BigDecimal;
import javax.inject.Inject;

public class DepositCommand extends BigDecimalCommand {

    private final Account account;

    @Inject
    public DepositCommand(Account account, Outputter outputter) {
        super(outputter);
        this.account = account;
    }


    @Override
    protected void handleAmount(BigDecimal amount) {
        account.deposit(amount);
        outputter.output(account.getUsername() + " now has: " + account.getBalance());

    }
}
