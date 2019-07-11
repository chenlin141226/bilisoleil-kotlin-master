package com.yoyiyi.soleil.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideIm9RetrofitFactory implements Factory<Retrofit> {
  private final ApiModule module;

  private final Provider<Retrofit.Builder> arg0Provider;

  private final Provider<OkHttpClient> arg1Provider;

  public ApiModule_ProvideIm9RetrofitFactory(
      ApiModule module,
      Provider<Retrofit.Builder> arg0Provider,
      Provider<OkHttpClient> arg1Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
    assert arg1Provider != null;
    this.arg1Provider = arg1Provider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideIm9Retrofit(arg0Provider.get(), arg1Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(
      ApiModule module,
      Provider<Retrofit.Builder> arg0Provider,
      Provider<OkHttpClient> arg1Provider) {
    return new ApiModule_ProvideIm9RetrofitFactory(module, arg0Provider, arg1Provider);
  }
}
