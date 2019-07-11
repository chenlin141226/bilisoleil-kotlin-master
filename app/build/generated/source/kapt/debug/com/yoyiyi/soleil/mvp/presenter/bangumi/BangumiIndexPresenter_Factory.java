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
public final class BangumiIndexPresenter_Factory implements Factory<BangumiIndexPresenter> {
  private final MembersInjector<BangumiIndexPresenter> bangumiIndexPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public BangumiIndexPresenter_Factory(
      MembersInjector<BangumiIndexPresenter> bangumiIndexPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert bangumiIndexPresenterMembersInjector != null;
    this.bangumiIndexPresenterMembersInjector = bangumiIndexPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public BangumiIndexPresenter get() {
    return MembersInjectors.injectMembers(
        bangumiIndexPresenterMembersInjector, new BangumiIndexPresenter(arg0Provider.get()));
  }

  public static Factory<BangumiIndexPresenter> create(
      MembersInjector<BangumiIndexPresenter> bangumiIndexPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new BangumiIndexPresenter_Factory(bangumiIndexPresenterMembersInjector, arg0Provider);
  }
}
