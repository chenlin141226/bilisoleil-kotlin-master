package com.yoyiyi.soleil.module.discover;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.discover.ActivityCenterPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityCenterActivity_MembersInjector
    implements MembersInjector<ActivityCenterActivity> {
  private final Provider<ActivityCenterPresenter> mPresenterProvider;

  public ActivityCenterActivity_MembersInjector(
      Provider<ActivityCenterPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<ActivityCenterActivity> create(
      Provider<ActivityCenterPresenter> mPresenterProvider) {
    return new ActivityCenterActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(ActivityCenterActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
