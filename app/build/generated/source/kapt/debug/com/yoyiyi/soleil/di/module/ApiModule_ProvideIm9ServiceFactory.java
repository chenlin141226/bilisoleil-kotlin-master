package com.yoyiyi.soleil.di.module;

import com.yoyiyi.soleil.network.api.Im9Service;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideIm9ServiceFactory implements Factory<Im9Service> {
  private final ApiModule module;

  private final Provider<Retrofit> arg0Provider;

  public ApiModule_ProvideIm9ServiceFactory(ApiModule module, Provider<Retrofit> arg0Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public Im9Service get() {
    return Preconditions.checkNotNull(
        module.provideIm9Service(arg0Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Im9Service> create(ApiModule module, Provider<Retrofit> arg0Provider) {
    return new ApiModule_ProvideIm9ServiceFactory(module, arg0Provider);
  }
}
