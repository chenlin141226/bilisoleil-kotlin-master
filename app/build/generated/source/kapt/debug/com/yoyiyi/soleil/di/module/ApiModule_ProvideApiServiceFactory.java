package com.yoyiyi.soleil.di.module;

import com.yoyiyi.soleil.network.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final ApiModule module;

  private final Provider<Retrofit> arg0Provider;

  public ApiModule_ProvideApiServiceFactory(ApiModule module, Provider<Retrofit> arg0Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public ApiService get() {
    return Preconditions.checkNotNull(
        module.provideApiService(arg0Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApiService> create(ApiModule module, Provider<Retrofit> arg0Provider) {
    return new ApiModule_ProvideApiServiceFactory(module, arg0Provider);
  }
}
