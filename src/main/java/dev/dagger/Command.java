package dev.dagger;

import java.util.List;

interface Command {

    String key();

    Status handleInput(List<String> input);

    enum Status {
        INVALID, HNDLED
    }

}
