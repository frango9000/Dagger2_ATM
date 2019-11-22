package dev.kurama;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {HelloWorldModule.class, LoginCommandModule.class, UserCommandsModule.class, SystemOutModule.class})
public interface CommandRouterFactory {

    CommandRouter router();
}
