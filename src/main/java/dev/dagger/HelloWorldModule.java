package dev.dagger;

import dagger.Binds;
import dagger.Module;

@Module
abstract class HelloWorldModule {

    @Binds
    abstract Command helloWorldCommand(HelloWorldCommand command);
}
