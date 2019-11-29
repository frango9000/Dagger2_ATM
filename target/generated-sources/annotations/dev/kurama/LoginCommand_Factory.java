package dev.kurama;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginCommand_Factory implements Factory<LoginCommand> {
  private final Provider<Outputter> outputterProvider;

  private final Provider<Database> databaseProvider;

  private final Provider<UserCommandsRouter.Factory> userCommandsRouterFactoryProvider;

  public LoginCommand_Factory(Provider<Outputter> outputterProvider,
      Provider<Database> databaseProvider,
      Provider<UserCommandsRouter.Factory> userCommandsRouterFactoryProvider) {
    this.outputterProvider = outputterProvider;
    this.databaseProvider = databaseProvider;
    this.userCommandsRouterFactoryProvider = userCommandsRouterFactoryProvider;
  }

  @Override
  public LoginCommand get() {
    return new LoginCommand(outputterProvider.get(), databaseProvider.get(), userCommandsRouterFactoryProvider.get());
  }

  public static LoginCommand_Factory create(Provider<Outputter> outputterProvider,
      Provider<Database> databaseProvider,
      Provider<UserCommandsRouter.Factory> userCommandsRouterFactoryProvider) {
    return new LoginCommand_Factory(outputterProvider, databaseProvider, userCommandsRouterFactoryProvider);
  }

  public static LoginCommand newInstance(Outputter outputter, Database database,
      UserCommandsRouter.Factory userCommandsRouterFactory) {
    return new LoginCommand(outputter, database, userCommandsRouterFactory);
  }
}
