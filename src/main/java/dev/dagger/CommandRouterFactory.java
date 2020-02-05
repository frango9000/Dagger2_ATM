package dev.dagger;

import dagger.Component;

@Component(modules = {LoginCommandModule.class, SystemOutModule.class})
public interface CommandRouterFactory {

    CommandRouter router();
}
