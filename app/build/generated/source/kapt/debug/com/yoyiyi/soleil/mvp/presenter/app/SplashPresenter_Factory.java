package com.yoyiyi.soleil.mvp.presenter.app;

import com.yoyiyi.soleil.network.helper.RetrofitHelper;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashPresenter_Factory implements Factory<SplashPresenter> {
  private final MembersInjector<SplashPresenter> splashPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public SplashPresenter_Factory(
      MembersInjector<SplashPresenter> splashPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert splashPresenterMembersInjector != null;
    this.splashPresenterMembersInjector = splashPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public SplashPresenter get() {
    return MembersInjectors.injectMembers(
        splashPresenterMembersInjector, new SplashPresenter(arg0Provider.get()));
  }

  public static Factory<SplashPresenter> create(
      MembersInjector<SplashPresenter> splashPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new SplashPresenter_Factory(splashPresenterMembersInjector, arg0Provider);
  }
}
