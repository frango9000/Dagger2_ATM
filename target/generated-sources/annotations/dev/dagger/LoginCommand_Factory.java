package dev.dagger;

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
  private final Provider<Database> databaseProvider;

  private final Provider<Outputter> outputterProvider;

  public LoginCommand_Factory(Provider<Database> databaseProvider,
      Provider<Outputter> outputterProvider) {
    this.databaseProvider = databaseProvider;
    this.outputterProvider = outputterProvider;
  }

  @Override
  public LoginCommand get() {
    return new LoginCommand(databaseProvider.get(), outputterProvider.get());
  }

  public static LoginCommand_Factory create(Provider<Database> databaseProvider,
      Provider<Outputter> outputterProvider) {
    return new LoginCommand_Factory(databaseProvider, outputterProvider);
  }

  public static LoginCommand newInstance(Object database, Object outputter) {
    return new LoginCommand((Database) database, (Outputter) outputter);
  }
}
