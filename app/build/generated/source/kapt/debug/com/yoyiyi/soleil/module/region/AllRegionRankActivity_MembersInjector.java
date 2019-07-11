package com.yoyiyi.soleil.module.region;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.app.NothingPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AllRegionRankActivity_MembersInjector
    implements MembersInjector<AllRegionRankActivity> {
  private final Provider<NothingPresenter> mPresenterProvider;

  public AllRegionRankActivity_MembersInjector(Provider<NothingPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<AllRegionRankActivity> create(
      Provider<NothingPresenter> mPresenterProvider) {
    return new AllRegionRankActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(AllRegionRankActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
