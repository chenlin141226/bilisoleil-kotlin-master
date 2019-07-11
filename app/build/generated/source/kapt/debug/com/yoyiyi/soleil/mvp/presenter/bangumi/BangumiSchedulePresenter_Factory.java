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
public final class BangumiSchedulePresenter_Factory implements Factory<BangumiSchedulePresenter> {
  private final MembersInjector<BangumiSchedulePresenter> bangumiSchedulePresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public BangumiSchedulePresenter_Factory(
      MembersInjector<BangumiSchedulePresenter> bangumiSchedulePresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert bangumiSchedulePresenterMembersInjector != null;
    this.bangumiSchedulePresenterMembersInjector = bangumiSchedulePresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public BangumiSchedulePresenter get() {
    return MembersInjectors.injectMembers(
        bangumiSchedulePresenterMembersInjector, new BangumiSchedulePresenter(arg0Provider.get()));
  }

  public static Factory<BangumiSchedulePresenter> create(
      MembersInjector<BangumiSchedulePresenter> bangumiSchedulePresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new BangumiSchedulePresenter_Factory(
        bangumiSchedulePresenterMembersInjector, arg0Provider);
  }
}
