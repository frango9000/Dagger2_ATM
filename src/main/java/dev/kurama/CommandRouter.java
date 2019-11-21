package dev.kurama;

import dev.kurama.Command.Status;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;

public final class CommandRouter {

    private final HashMap<String, Command> commands = new HashMap<>();

    @Inject
    public CommandRouter(HelloWorldCommand helloWorldCommand) {
        commands.put(helloWorldCommand.key(), helloWorldCommand);
    }

    Status route(String input) {
        List<String> splitInput = split(input);
        if (splitInput.isEmpty()) {
            return invalidCommand(input);
        }

        String commandKey = splitInput.get(0);
        Command command = commands.get(commandKey);
        if (command == null) {
            return invalidCommand(input);
        }

        Status status = command.handleInput(splitInput.subList(1, splitInput.size()));
        if (status == Status.INVALID) {
            System.out.println(commandKey + ": invalid arguments");
        }
        return status;
    }

    private Status invalidCommand(String input) {
        System.out.println(String.format("couldn't understand \"%s\". please try again.", input));
        return Status.INVALID;
    }

    // Split on whitespace
    private static List<String> split(String string) {
        return Arrays.asList(string.split(" "));
    }

}
