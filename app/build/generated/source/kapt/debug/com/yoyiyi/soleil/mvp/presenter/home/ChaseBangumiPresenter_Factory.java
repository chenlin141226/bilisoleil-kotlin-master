package com.yoyiyi.soleil.mvp.presenter.home;

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
public final class ChaseBangumiPresenter_Factory implements Factory<ChaseBangumiPresenter> {
  private final MembersInjector<ChaseBangumiPresenter> chaseBangumiPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public ChaseBangumiPresenter_Factory(
      MembersInjector<ChaseBangumiPresenter> chaseBangumiPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert chaseBangumiPresenterMembersInjector != null;
    this.chaseBangumiPresenterMembersInjector = chaseBangumiPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public ChaseBangumiPresenter get() {
    return MembersInjectors.injectMembers(
        chaseBangumiPresenterMembersInjector, new ChaseBangumiPresenter(arg0Provider.get()));
  }

  public static Factory<ChaseBangumiPresenter> create(
      MembersInjector<ChaseBangumiPresenter> chaseBangumiPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new ChaseBangumiPresenter_Factory(chaseBangumiPresenterMembersInjector, arg0Provider);
  }
}
