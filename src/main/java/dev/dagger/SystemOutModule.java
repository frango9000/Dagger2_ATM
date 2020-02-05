package dev.dagger;

import dagger.Module;
import dagger.Provides;

@Module
abstract class SystemOutModule {

    @Provides
    static Outputter textOutputter() {
        return x -> {
            System.out.println(x);
        };
    }
}
