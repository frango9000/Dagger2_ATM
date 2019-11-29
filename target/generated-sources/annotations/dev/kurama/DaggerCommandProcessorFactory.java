package dev.kurama;

import dagger.internal.DoubleCheck;
import dagger.internal.MapFactory;
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
public final class DaggerCommandProcessorFactory implements CommandProcessorFactory {
  private Provider<HelloWorldCommand> helloWorldCommandProvider;

  private Provider<Database> databaseProvider;

  private Provider<LoginCommand> loginCommandProvider;

  private Provider<DepositCommand> depositCommandProvider;

  private Provider<Map<String, Command>> mapOfStringAndCommandProvider;

  private Provider<CommandRouter> commandRouterProvider;

  private Provider<CommandProcessor> commandProcessorProvider;

  private DaggerCommandProcessorFactory() {

    initialize();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CommandProcessorFactory create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.helloWorldCommandProvider = HelloWorldCommand_Factory.create(SystemOutModule_TextOutputterFactory.create());
    this.databaseProvider = DoubleCheck.provider(Database_Factory.create());
    this.loginCommandProvider = LoginCommand_Factory.create(SystemOutModule_TextOutputterFactory.create(), databaseProvider);
    this.depositCommandProvider = DepositCommand_Factory.create(databaseProvider, SystemOutModule_TextOutputterFactory.create());
    this.mapOfStringAndCommandProvider = MapFactory.<String, Command>builder(3).put("hello", (Provider) helloWorldCommandProvider).put("login", (Provider) loginCommandProvider).put("deposit", (Provider) depositCommandProvider).build();
    this.commandRouterProvider = CommandRouter_Factory.create(mapOfStringAndCommandProvider);
    this.commandProcessorProvider = DoubleCheck.provider(CommandProcessor_Factory.create(commandRouterProvider));
  }

  @Override
  public CommandProcessor commandProcessor() {
    return commandProcessorProvider.get();}

  public static final class Builder {
    private Builder() {
    }

    public CommandProcessorFactory build() {
      return new DaggerCommandProcessorFactory();
    }
  }
}
