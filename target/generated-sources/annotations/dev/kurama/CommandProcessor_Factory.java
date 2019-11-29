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
public final class CommandProcessor_Factory implements Factory<CommandProcessor> {
  private final Provider<CommandRouter> firstCommandRouterProvider;

  public CommandProcessor_Factory(Provider<CommandRouter> firstCommandRouterProvider) {
    this.firstCommandRouterProvider = firstCommandRouterProvider;
  }

  @Override
  public CommandProcessor get() {
    return new CommandProcessor(firstCommandRouterProvider.get());
  }

  public static CommandProcessor_Factory create(
      Provider<CommandRouter> firstCommandRouterProvider) {
    return new CommandProcessor_Factory(firstCommandRouterProvider);
  }

  public static CommandProcessor newInstance(CommandRouter firstCommandRouter) {
    return new CommandProcessor(firstCommandRouter);
  }
}
