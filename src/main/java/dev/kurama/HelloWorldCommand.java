package dev.kurama;

import java.util.List;
import javax.inject.Inject;

public class HelloWorldCommand implements Command {

    private final Outputter outputter;

    @Inject
    HelloWorldCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    public Status handleInput(List<String> input) {
        if (!input.isEmpty()) {
            return Status.INVALID;
        }
        outputter.output("world!");
        return Status.HANDLED;
    }
}
