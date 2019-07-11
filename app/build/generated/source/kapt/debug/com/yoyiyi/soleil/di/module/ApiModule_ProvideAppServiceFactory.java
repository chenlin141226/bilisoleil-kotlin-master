package com.yoyiyi.soleil.di.module;

import com.yoyiyi.soleil.network.api.AppService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideAppServiceFactory implements Factory<AppService> {
  private final ApiModule module;

  private final Provider<Retrofit> arg0Provider;

  public ApiModule_ProvideAppServiceFactory(ApiModule module, Provider<Retrofit> arg0Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public AppService get() {
    return Preconditions.checkNotNull(
        module.provideAppService(arg0Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AppService> create(ApiModule module, Provider<Retrofit> arg0Provider) {
    return new ApiModule_ProvideAppServiceFactory(module, arg0Provider);
  }
}
