package com.yoyiyi.soleil.di.component;

import android.content.Context;
import com.yoyiyi.soleil.di.module.ApiModule;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideApiRetrofitFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideApiServiceFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideAppRetrofitFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideAppServiceFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideBangumiRetrofitFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideBangumiServiceFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideIm9RetrofitFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideIm9ServiceFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideLiveRetrofitFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideLiveServiceFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideOkHttpClientFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideRankRetrofitFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideRankServiceFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideRetrofitBuilderFactory;
import com.yoyiyi.soleil.di.module.ApiModule_ProvideRetrofitHelperFactory;
import com.yoyiyi.soleil.di.module.AppModule;
import com.yoyiyi.soleil.di.module.AppModule_ProvideContextFactory;
import com.yoyiyi.soleil.network.api.ApiService;
import com.yoyiyi.soleil.network.api.AppService;
import com.yoyiyi.soleil.network.api.BangumiService;
import com.yoyiyi.soleil.network.api.Im9Service;
import com.yoyiyi.soleil.network.api.LiveService;
import com.yoyiyi.soleil.network.api.RankService;
import com.yoyiyi.soleil.network.helper.RetrofitHelper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Context> provideContextProvider;

  private Provider<Retrofit.Builder> provideRetrofitBuilderProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit> provideAppRetrofitProvider;

  private Provider<AppService> provideAppServiceProvider;

  private Provider<Retrofit> provideLiveRetrofitProvider;

  private Provider<LiveService> provideLiveServiceProvider;

  private Provider<Retrofit> provideBangumiRetrofitProvider;

  private Provider<BangumiService> provideBangumiServiceProvider;

  private Provider<Retrofit> provideRankRetrofitProvider;

  private Provider<RankService> provideRankServiceProvider;

  private Provider<Retrofit> provideApiRetrofitProvider;

  private Provider<ApiService> provideApiServiceProvider;

  private Provider<Retrofit> provideIm9RetrofitProvider;

  private Provider<Im9Service> provideIm9ServiceProvider;

  private Provider<RetrofitHelper> provideRetrofitHelperProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider = AppModule_ProvideContextFactory.create(builder.appModule);

    this.provideRetrofitBuilderProvider =
        DoubleCheck.provider(ApiModule_ProvideRetrofitBuilderFactory.create(builder.apiModule));

    this.provideOkHttpClientProvider =
        DoubleCheck.provider(ApiModule_ProvideOkHttpClientFactory.create(builder.apiModule));

    this.provideAppRetrofitProvider =
        DoubleCheck.provider(
            ApiModule_ProvideAppRetrofitFactory.create(
                builder.apiModule, provideRetrofitBuilderProvider, provideOkHttpClientProvider));

    this.provideAppServiceProvider =
        DoubleCheck.provider(
            ApiModule_ProvideAppServiceFactory.create(
                builder.apiModule, provideAppRetrofitProvider));

    this.provideLiveRetrofitProvider =
        DoubleCheck.provider(
            ApiModule_ProvideLiveRetrofitFactory.create(
                builder.apiModule, provideRetrofitBuilderProvider, provideOkHttpClientProvider));

    this.provideLiveServiceProvider =
        DoubleCheck.provider(
            ApiModule_ProvideLiveServiceFactory.create(
                builder.apiModule, provideLiveRetrofitProvider));

    this.provideBangumiRetrofitProvider =
        DoubleCheck.provider(
            ApiModule_ProvideBangumiRetrofitFactory.create(
                builder.apiModule, provideRetrofitBuilderProvider, provideOkHttpClientProvider));

    this.provideBangumiServiceProvider =
        DoubleCheck.provider(
            ApiModule_ProvideBangumiServiceFactory.create(
                builder.apiModule, provideBangumiRetrofitProvider));

    this.provideRankRetrofitProvider =
        DoubleCheck.provider(
            ApiModule_ProvideRankRetrofitFactory.create(
                builder.apiModule, provideRetrofitBuilderProvider, provideOkHttpClientProvider));

    this.provideRankServiceProvider =
        DoubleCheck.provider(
            ApiModule_ProvideRankServiceFactory.create(
                builder.apiModule, provideRankRetrofitProvider));

    this.provideApiRetrofitProvider =
        DoubleCheck.provider(
            ApiModule_ProvideApiRetrofitFactory.create(
                builder.apiModule, provideRetrofitBuilderProvider, provideOkHttpClientProvider));

    this.provideApiServiceProvider =
        DoubleCheck.provider(
            ApiModule_ProvideApiServiceFactory.create(
                builder.apiModule, provideApiRetrofitProvider));

    this.provideIm9RetrofitProvider =
        DoubleCheck.provider(
            ApiModule_ProvideIm9RetrofitFactory.create(
                builder.apiModule, provideRetrofitBuilderProvider, provideOkHttpClientProvider));

    this.provideIm9ServiceProvider =
        DoubleCheck.provider(
            ApiModule_ProvideIm9ServiceFactory.create(
                builder.apiModule, provideIm9RetrofitProvider));

    this.provideRetrofitHelperProvider =
        DoubleCheck.provider(
            ApiModule_ProvideRetrofitHelperFactory.create(
                builder.apiModule,
                provideAppServiceProvider,
                provideLiveServiceProvider,
                provideBangumiServiceProvider,
                provideRankServiceProvider,
                provideApiServiceProvider,
                provideIm9ServiceProvider));
  }

  @Override
  public Context getContext() {
    return provideContextProvider.get();
  }

  @Override
  public RetrofitHelper getRetrofitHelper() {
    return provideRetrofitHelperProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;

    private ApiModule apiModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (apiModule == null) {
        this.apiModule = new ApiModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder apiModule(ApiModule apiModule) {
      this.apiModule = Preconditions.checkNotNull(apiModule);
      return this;
    }
  }
}
