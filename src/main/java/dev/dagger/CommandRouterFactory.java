package dev.dagger;

import dagger.Component;

@Component(modules = {LoginCommandModule.class, HelloWorldModule.class, SystemOutModule.class})
public interface CommandRouterFactory {

    CommandRouter router();
}
