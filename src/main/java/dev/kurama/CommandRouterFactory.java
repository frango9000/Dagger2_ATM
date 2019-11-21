package dev.kurama;

import dagger.Component;

@Component(modules = HelloWorldModule.class)
public interface CommandRouterFactory {

    CommandRouter router();
}
