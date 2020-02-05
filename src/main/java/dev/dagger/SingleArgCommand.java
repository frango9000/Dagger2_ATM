package dev.dagger;

import java.util.List;

abstract class SingleArgCommand implements Command {

    @Override
    public Status handleInput(List<String> input) {
        return input.size() == 1 ? handleArg(input.get(0)) : Status.INVALID;
    }

    protected abstract Status handleArg(String s);
}
