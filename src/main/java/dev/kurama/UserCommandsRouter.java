package dev.kurama;

import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dev.kurama.Database.Account;

@Subcomponent(modules = UserCommandsModule.class)
public interface UserCommandsRouter {

    CommandRouter router();

    @Subcomponent.Factory
    interface Factory {

        UserCommandsRouter create(@BindsInstance Account account);
    }

    @Module(subcomponents = UserCommandsRouter.class)
    interface InstallationModule {

    }

}
