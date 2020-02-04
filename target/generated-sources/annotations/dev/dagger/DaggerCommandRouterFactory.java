package dev.dagger;

import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCommandRouterFactory implements CommandRouterFactory {
  private DaggerCommandRouterFactory() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static CommandRouterFactory create() {
    return new Builder().build();
  }

  @Override
  public CommandRouter router() {
    return new CommandRouter();}

  public static final class Builder {
    private Builder() {
    }

    public CommandRouterFactory build() {
      return new DaggerCommandRouterFactory();
    }
  }
}
