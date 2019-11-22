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

  public LoginCommand_Factory(Provider<Outputter> outputterProvider,
      Provider<Database> databaseProvider) {
    this.outputterProvider = outputterProvider;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public LoginCommand get() {
    return new LoginCommand(outputterProvider.get(), databaseProvider.get());
  }

  public static LoginCommand_Factory create(Provider<Outputter> outputterProvider,
      Provider<Database> databaseProvider) {
    return new LoginCommand_Factory(outputterProvider, databaseProvider);
  }

  public static LoginCommand newInstance(Outputter outputter, Database database) {
    return new LoginCommand(outputter, database);
  }
}
