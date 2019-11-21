package dev.kurama;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class HelloWorldModule {

    @Binds
    abstract Command helloWorldCommand(HelloWorldCommand command);
}
