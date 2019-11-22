package dev.kurama;

import javax.inject.Inject;

public class LoginCommand extends SingleArgCommand {
    private final Outputter outputter;

    @Inject
    public LoginCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    protected Status handleArg(String username) {
        outputter.output(username + " is logged in.");
        return Status.HANDLED;
    }
}
