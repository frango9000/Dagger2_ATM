package dev.dagger;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CommandRouter_Factory implements Factory<CommandRouter> {
  private static final CommandRouter_Factory INSTANCE = new CommandRouter_Factory();

  @Override
  public CommandRouter get() {
    return new CommandRouter();
  }

  public static CommandRouter_Factory create() {
    return INSTANCE;
  }

  public static CommandRouter newInstance() {
    return new CommandRouter();
  }
}
