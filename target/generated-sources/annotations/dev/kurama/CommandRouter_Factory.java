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
public final class CommandRouter_Factory implements Factory<CommandRouter> {
  private final Provider<HelloWorldCommand> helloWorldCommandProvider;

  public CommandRouter_Factory(Provider<HelloWorldCommand> helloWorldCommandProvider) {
    this.helloWorldCommandProvider = helloWorldCommandProvider;
  }

  @Override
  public CommandRouter get() {
    return new CommandRouter(helloWorldCommandProvider.get());
  }

  public static CommandRouter_Factory create(
      Provider<HelloWorldCommand> helloWorldCommandProvider) {
    return new CommandRouter_Factory(helloWorldCommandProvider);
  }

  public static CommandRouter newInstance(HelloWorldCommand helloWorldCommand) {
    return new CommandRouter(helloWorldCommand);
  }
}
