package dev.dagger;

import com.google.common.collect.ImmutableMap;
import dagger.internal.DoubleCheck;
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
public final class DaggerCommandRouterFactory implements CommandRouterFactory {
  private Provider<Database> databaseProvider;

  private DaggerCommandRouterFactory() {

    initialize();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CommandRouterFactory create() {
    return new Builder().build();
  }

  private LoginCommand getLoginCommand() {
    return new LoginCommand(databaseProvider.get(), SystemOutModule_TextOutputterFactory.textOutputter());}

  private HelloWorldCommand getHelloWorldCommand() {
    return new HelloWorldCommand(SystemOutModule_TextOutputterFactory.textOutputter());}

  private DepositCommand getDepositCommand() {
    return new DepositCommand(databaseProvider.get(), SystemOutModule_TextOutputterFactory.textOutputter());}

  private Map<String, Command> getMapOfStringAndCommand() {
    return ImmutableMap.<String, Command>of("login", getLoginCommand(), "hello", getHelloWorldCommand(), "deposit", getDepositCommand());}

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.databaseProvider = DoubleCheck.provider(Database_Factory.create());
  }

  @Override
  public CommandRouter router() {
    return new CommandRouter(getMapOfStringAndCommand());}

  public static final class Builder {
    private Builder() {
    }

    public CommandRouterFactory build() {
      return new DaggerCommandRouterFactory();
    }
  }
}
