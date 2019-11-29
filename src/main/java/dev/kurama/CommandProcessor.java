package dev.kurama;

import dev.kurama.Command.Result;
import dev.kurama.Command.Status;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CommandProcessor {

    private final Deque<CommandRouter> commandRouterStack = new ArrayDeque<>();

    @Inject

    public CommandProcessor(CommandRouter firstCommandRouter) {
        commandRouterStack.push(firstCommandRouter);
    }

    Status process(String input) {
        Result result = commandRouterStack.peek().route(input);
        if (result.getStatus().equals(Status.INPUT_COMPLETED)) {
            commandRouterStack.pop();
            return commandRouterStack.isEmpty()
                   ? Status.INPUT_COMPLETED
                   : Status.HANDLED;
        }
        result.getNestedCommandRouter().ifPresent(commandRouterStack::push);
        return result.getStatus();
    }
}
