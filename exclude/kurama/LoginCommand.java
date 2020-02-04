package dev.kurama;

import dev.kurama.Database.Account;
import javax.inject.Inject;

public class LoginCommand extends SingleArgCommand {

    private final Outputter outputter;
    private final Database database;
    private final UserCommandsRouter.Factory userCommandsRouterFactory;

    @Inject
    public LoginCommand(Outputter outputter, Database database, UserCommandsRouter.Factory userCommandsRouterFactory) {
        this.outputter                 = outputter;
        this.database                  = database;
        this.userCommandsRouterFactory = userCommandsRouterFactory;
    }



    @Override
    protected Result handleArg(String username) {
        Account account = database.getAccount(username);
        outputter.output(username + " is logged in with balance: " + account.getBalance());
        return Result.enterNestedCommandSet(userCommandsRouterFactory.create(account).router());
    }
}
