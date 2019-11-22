package dev.kurama;

import java.util.List;

public interface Command {

    /**
     * String token that signifies this command should be selected (e.g.: "deposit", "withdraw")
     */
//    String key();

    /**
     * Process the rest of the command's words and do something.
     */
    Status handleInput(List<String> input);

    enum Status {
        INVALID,
        HANDLED
    }
}
