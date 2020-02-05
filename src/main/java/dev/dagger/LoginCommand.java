package dev.dagger;

import dev.dagger.Database.Account;
import javax.inject.Inject;

final class LoginCommand extends SingleArgCommand {

    private final Database database;
    private final Outputter outputter;

    @Inject
    LoginCommand(Database database, Outputter outputter) {
        this.database  = database;
        this.outputter = outputter;
    }

    @Override
    public String key() {
        return "login";
    }

    @Override
    public Status handleArg(String username) {
        Account account = database.getAccount(username);
        outputter.output(username + " is logged in with balance: " + account.balance());
        return Status.HANDLED;
    }
}