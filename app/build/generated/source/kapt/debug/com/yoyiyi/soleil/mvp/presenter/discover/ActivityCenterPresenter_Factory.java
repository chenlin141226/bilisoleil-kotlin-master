package com.yoyiyi.soleil.mvp.presenter.discover;

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
public final class ActivityCenterPresenter_Factory implements Factory<ActivityCenterPresenter> {
  private final MembersInjector<ActivityCenterPresenter> activityCenterPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public ActivityCenterPresenter_Factory(
      MembersInjector<ActivityCenterPresenter> activityCenterPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert activityCenterPresenterMembersInjector != null;
    this.activityCenterPresenterMembersInjector = activityCenterPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public ActivityCenterPresenter get() {
    return MembersInjectors.injectMembers(
        activityCenterPresenterMembersInjector, new ActivityCenterPresenter(arg0Provider.get()));
  }

  public static Factory<ActivityCenterPresenter> create(
      MembersInjector<ActivityCenterPresenter> activityCenterPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new ActivityCenterPresenter_Factory(
        activityCenterPresenterMembersInjector, arg0Provider);
  }
}
