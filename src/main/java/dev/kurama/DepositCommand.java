package dev.kurama;

import dev.kurama.Database.Account;
import java.math.BigDecimal;
import java.util.List;
import javax.inject.Inject;

public class DepositCommand implements Command {
    private final Database database;
    private final Outputter outputter;
    @Inject

    public DepositCommand(Database database, Outputter outputter) {
        this.database  = database;
        this.outputter = outputter;
    }

    @Override
    public Result handleInput(List<String> input) {
        if (input.size() != 2)
            return Result.invalid();
        Account account = database.getAccount(input.get(0));
        account.deposit(new BigDecimal(input.get(1)));
        outputter.output(account.getUsername() + " now has: " + account.getBalance());
        return Result.handled();
    }
}
