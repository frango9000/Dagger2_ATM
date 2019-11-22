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
public final class DepositCommand_Factory implements Factory<DepositCommand> {
  private final Provider<Database> databaseProvider;

  private final Provider<Outputter> outputterProvider;

  public DepositCommand_Factory(Provider<Database> databaseProvider,
      Provider<Outputter> outputterProvider) {
    this.databaseProvider = databaseProvider;
    this.outputterProvider = outputterProvider;
  }

  @Override
  public DepositCommand get() {
    return new DepositCommand(databaseProvider.get(), outputterProvider.get());
  }

  public static DepositCommand_Factory create(Provider<Database> databaseProvider,
      Provider<Outputter> outputterProvider) {
    return new DepositCommand_Factory(databaseProvider, outputterProvider);
  }

  public static DepositCommand newInstance(Database database, Outputter outputter) {
    return new DepositCommand(database, outputter);
  }
}
