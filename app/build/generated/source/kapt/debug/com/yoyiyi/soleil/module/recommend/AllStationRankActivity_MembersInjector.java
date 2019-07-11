package com.yoyiyi.soleil.module.recommend;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.app.NothingPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AllStationRankActivity_MembersInjector
    implements MembersInjector<AllStationRankActivity> {
  private final Provider<NothingPresenter> mPresenterProvider;

  public AllStationRankActivity_MembersInjector(Provider<NothingPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<AllStationRankActivity> create(
      Provider<NothingPresenter> mPresenterProvider) {
    return new AllStationRankActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(AllStationRankActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
