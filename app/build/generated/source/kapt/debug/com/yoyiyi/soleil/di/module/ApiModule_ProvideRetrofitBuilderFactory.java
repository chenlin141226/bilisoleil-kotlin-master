package com.yoyiyi.soleil.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideRetrofitBuilderFactory implements Factory<Retrofit.Builder> {
  private final ApiModule module;

  public ApiModule_ProvideRetrofitBuilderFactory(ApiModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Retrofit.Builder get() {
    return Preconditions.checkNotNull(
        module.provideRetrofitBuilder(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit.Builder> create(ApiModule module) {
    return new ApiModule_ProvideRetrofitBuilderFactory(module);
  }
}
