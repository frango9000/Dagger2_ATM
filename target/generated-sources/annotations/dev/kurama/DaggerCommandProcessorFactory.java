package dev.kurama;

import com.google.common.collect.ImmutableMap;
import dagger.internal.DoubleCheck;
import dagger.internal.MapFactory;
import dagger.internal.Preconditions;
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

  private Provider<UserCommandsRouter.Factory> userCommandsRouterFactoryProvider;

  private Provider<LoginCommand> loginCommandProvider;

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

  private HelloWorldCommand getHelloWorldCommand() {
    return new HelloWorldCommand(SystemOutModule_TextOutputterFactory.textOutputter());}

  private LoginCommand getLoginCommand() {
    return new LoginCommand(SystemOutModule_TextOutputterFactory.textOutputter(), databaseProvider.get(), new UserCommandsRouterFactory());}

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.helloWorldCommandProvider = HelloWorldCommand_Factory.create(SystemOutModule_TextOutputterFactory.create());
    this.databaseProvider = DoubleCheck.provider(Database_Factory.create());
    this.userCommandsRouterFactoryProvider = new Provider<UserCommandsRouter.Factory>() {
      @Override
      public UserCommandsRouter.Factory get() {
        return new UserCommandsRouterFactory();}
    };
    this.loginCommandProvider = LoginCommand_Factory.create(SystemOutModule_TextOutputterFactory.create(), databaseProvider, userCommandsRouterFactoryProvider);
    this.mapOfStringAndCommandProvider = MapFactory.<String, Command>builder(2).put("hello", (Provider) helloWorldCommandProvider).put("login", (Provider) loginCommandProvider).build();
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

  private final class UserCommandsRouterFactory implements UserCommandsRouter.Factory {
    @Override
    public UserCommandsRouter create(Database.Account account) {
      Preconditions.checkNotNull(account);
      return new UserCommandsRouterImpl(account);
    }
  }

  private final class UserCommandsRouterImpl implements UserCommandsRouter {
    private final Database.Account account;

    private UserCommandsRouterImpl(Database.Account accountParam) {
      this.account = accountParam;
    }

    private DepositCommand getDepositCommand() {
      return new DepositCommand(account, SystemOutModule_TextOutputterFactory.textOutputter());}

    private Map<String, Command> getMapOfStringAndCommand() {
      return ImmutableMap.<String, Command>of("hello", DaggerCommandProcessorFactory.this.getHelloWorldCommand(), "login", DaggerCommandProcessorFactory.this.getLoginCommand(), "deposit", getDepositCommand());}

    @Override
    public CommandRouter router() {
      return new CommandRouter(getMapOfStringAndCommand());}
  }
}
