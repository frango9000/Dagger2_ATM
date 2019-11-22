package dev.kurama;

import dagger.internal.Factory;
import java.util.Map;
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
  private final Provider<Map<String, Command>> commandsProvider;

  public CommandRouter_Factory(Provider<Map<String, Command>> commandsProvider) {
    this.commandsProvider = commandsProvider;
  }

  @Override
  public CommandRouter get() {
    return new CommandRouter(commandsProvider.get());
  }

  public static CommandRouter_Factory create(Provider<Map<String, Command>> commandsProvider) {
    return new CommandRouter_Factory(commandsProvider);
  }

  public static CommandRouter newInstance(Map<String, Command> commands) {
    return new CommandRouter(commands);
  }
}
