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
public final class HelloWorldCommand_Factory implements Factory<HelloWorldCommand> {
  private static final HelloWorldCommand_Factory INSTANCE = new HelloWorldCommand_Factory();

  @Override
  public HelloWorldCommand get() {
    return new HelloWorldCommand();
  }

  public static HelloWorldCommand_Factory create() {
    return INSTANCE;
  }

  public static HelloWorldCommand newInstance() {
    return new HelloWorldCommand();
  }
}
