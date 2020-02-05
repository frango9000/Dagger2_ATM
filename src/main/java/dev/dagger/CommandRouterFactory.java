package dev.dagger;

import dagger.Component;

@Component(modules = HelloWorldModule.class)
public interface CommandRouterFactory {

    CommandRouter router();
}
