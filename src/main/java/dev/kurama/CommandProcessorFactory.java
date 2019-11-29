package dev.kurama;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {HelloWorldModule.class, LoginCommandModule.class, UserCommandsRouter.InstallationModule.class, SystemOutModule.class})
public interface CommandProcessorFactory {

    CommandProcessor commandProcessor();

    static CommandProcessorFactory create() {
        return DaggerCommandProcessorFactory.create();
    }
}
