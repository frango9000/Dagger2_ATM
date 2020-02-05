package dev.dagger;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {LoginCommandModule.class, HelloWorldModule.class, SystemOutModule.class, UserCommandsModule.class})
public interface CommandRouterFactory {

    CommandRouter router();
}
