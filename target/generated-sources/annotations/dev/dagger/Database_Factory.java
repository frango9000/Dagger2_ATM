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
public final class Database_Factory implements Factory<Database> {
  private static final Database_Factory INSTANCE = new Database_Factory();

  @Override
  public Database get() {
    return new Database();
  }

  public static Database_Factory create() {
    return INSTANCE;
  }

  public static Database newInstance() {
    return new Database();
  }
}
