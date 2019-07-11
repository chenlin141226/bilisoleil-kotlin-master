package com.yoyiyi.soleil.module.bangumi;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.bangumi.BangumiSchedulePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BangumiScheduleActivity_MembersInjector
    implements MembersInjector<BangumiScheduleActivity> {
  private final Provider<BangumiSchedulePresenter> mPresenterProvider;

  public BangumiScheduleActivity_MembersInjector(
      Provider<BangumiSchedulePresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BangumiScheduleActivity> create(
      Provider<BangumiSchedulePresenter> mPresenterProvider) {
    return new BangumiScheduleActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BangumiScheduleActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
