package com.yoyiyi.soleil.di.module;

import com.yoyiyi.soleil.network.api.ApiService;
import com.yoyiyi.soleil.network.api.AppService;
import com.yoyiyi.soleil.network.api.BangumiService;
import com.yoyiyi.soleil.network.api.Im9Service;
import com.yoyiyi.soleil.network.api.LiveService;
import com.yoyiyi.soleil.network.api.RankService;
import com.yoyiyi.soleil.network.helper.RetrofitHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideRetrofitHelperFactory implements Factory<RetrofitHelper> {
  private final ApiModule module;

  private final Provider<AppService> arg0Provider;

  private final Provider<LiveService> arg1Provider;

  private final Provider<BangumiService> arg2Provider;

  private final Provider<RankService> arg3Provider;

  private final Provider<ApiService> arg4Provider;

  private final Provider<Im9Service> arg5Provider;

  public ApiModule_ProvideRetrofitHelperFactory(
      ApiModule module,
      Provider<AppService> arg0Provider,
      Provider<LiveService> arg1Provider,
      Provider<BangumiService> arg2Provider,
      Provider<RankService> arg3Provider,
      Provider<ApiService> arg4Provider,
      Provider<Im9Service> arg5Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
    assert arg1Provider != null;
    this.arg1Provider = arg1Provider;
    assert arg2Provider != null;
    this.arg2Provider = arg2Provider;
    assert arg3Provider != null;
    this.arg3Provider = arg3Provider;
    assert arg4Provider != null;
    this.arg4Provider = arg4Provider;
    assert arg5Provider != null;
    this.arg5Provider = arg5Provider;
  }

  @Override
  public RetrofitHelper get() {
    return Preconditions.checkNotNull(
        module.provideRetrofitHelper(
            arg0Provider.get(),
            arg1Provider.get(),
            arg2Provider.get(),
            arg3Provider.get(),
            arg4Provider.get(),
            arg5Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RetrofitHelper> create(
      ApiModule module,
      Provider<AppService> arg0Provider,
      Provider<LiveService> arg1Provider,
      Provider<BangumiService> arg2Provider,
      Provider<RankService> arg3Provider,
      Provider<ApiService> arg4Provider,
      Provider<Im9Service> arg5Provider) {
    return new ApiModule_ProvideRetrofitHelperFactory(
        module, arg0Provider, arg1Provider, arg2Provider, arg3Provider, arg4Provider, arg5Provider);
  }
}
