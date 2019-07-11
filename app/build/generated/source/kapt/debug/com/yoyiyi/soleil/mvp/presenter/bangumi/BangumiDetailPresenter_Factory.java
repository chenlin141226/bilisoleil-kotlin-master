package com.yoyiyi.soleil.mvp.presenter.bangumi;

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
public final class BangumiDetailPresenter_Factory implements Factory<BangumiDetailPresenter> {
  private final MembersInjector<BangumiDetailPresenter> bangumiDetailPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public BangumiDetailPresenter_Factory(
      MembersInjector<BangumiDetailPresenter> bangumiDetailPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert bangumiDetailPresenterMembersInjector != null;
    this.bangumiDetailPresenterMembersInjector = bangumiDetailPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public BangumiDetailPresenter get() {
    return MembersInjectors.injectMembers(
        bangumiDetailPresenterMembersInjector, new BangumiDetailPresenter(arg0Provider.get()));
  }

  public static Factory<BangumiDetailPresenter> create(
      MembersInjector<BangumiDetailPresenter> bangumiDetailPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new BangumiDetailPresenter_Factory(bangumiDetailPresenterMembersInjector, arg0Provider);
  }
}
