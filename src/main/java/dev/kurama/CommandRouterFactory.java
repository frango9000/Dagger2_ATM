package dev.kurama;

import dagger.Component;

@Component(modules = {HelloWorldModule.class, LoginCommandModule.class, SystemOutModule.class})
public interface CommandRouterFactory {

    CommandRouter router();
}
