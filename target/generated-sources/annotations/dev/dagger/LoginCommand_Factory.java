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
  private final Provider<Outputter> outputterProvider;

  public LoginCommand_Factory(Provider<Outputter> outputterProvider) {
    this.outputterProvider = outputterProvider;
  }

  @Override
  public LoginCommand get() {
    return new LoginCommand(outputterProvider.get());
  }

  public static LoginCommand_Factory create(Provider<Outputter> outputterProvider) {
    return new LoginCommand_Factory(outputterProvider);
  }

  public static LoginCommand newInstance(Object outputter) {
    return new LoginCommand((Outputter) outputter);
  }
}
