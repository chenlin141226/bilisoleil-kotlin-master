package com.yoyiyi.soleil.di.module;

import com.yoyiyi.soleil.network.api.RankService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideRankServiceFactory implements Factory<RankService> {
  private final ApiModule module;

  private final Provider<Retrofit> arg0Provider;

  public ApiModule_ProvideRankServiceFactory(ApiModule module, Provider<Retrofit> arg0Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public RankService get() {
    return Preconditions.checkNotNull(
        module.provideRankService(arg0Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RankService> create(ApiModule module, Provider<Retrofit> arg0Provider) {
    return new ApiModule_ProvideRankServiceFactory(module, arg0Provider);
  }
}
