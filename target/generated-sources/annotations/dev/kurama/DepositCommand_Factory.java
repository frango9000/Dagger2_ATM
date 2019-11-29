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
  private final Provider<Database.Account> accountProvider;

  private final Provider<Outputter> outputterProvider;

  public DepositCommand_Factory(Provider<Database.Account> accountProvider,
      Provider<Outputter> outputterProvider) {
    this.accountProvider = accountProvider;
    this.outputterProvider = outputterProvider;
  }

  @Override
  public DepositCommand get() {
    return new DepositCommand(accountProvider.get(), outputterProvider.get());
  }

  public static DepositCommand_Factory create(Provider<Database.Account> accountProvider,
      Provider<Outputter> outputterProvider) {
    return new DepositCommand_Factory(accountProvider, outputterProvider);
  }

  public static DepositCommand newInstance(Object account, Outputter outputter) {
    return new DepositCommand((Database.Account) account, outputter);
  }
}
