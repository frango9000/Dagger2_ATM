package dev.dagger;

import java.util.List;
import javax.inject.Inject;

final class HelloWorldCommand implements Command {

    @Inject
    HelloWorldCommand() {
    }

    @Override
    public String key() {
        return "hello";
    }

    @Override
    public Status handleInput(List<String> input) {
        if (!input.isEmpty()) {
            return Status.INVALID;
        }
        System.out.println("world!");
        return Status.HANDLED;
    }
}
