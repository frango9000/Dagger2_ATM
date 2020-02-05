package dev.dagger;

import dagger.Binds;
import dagger.Module;

@Module
abstract class LoginCommandModule {

    @Binds
    abstract Command loginCommand(LoginCommand command);
}
