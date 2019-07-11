package com.yoyiyi.soleil.module.region;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.region.AllRegionRankPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AllRegionRankFragment_MembersInjector
    implements MembersInjector<AllRegionRankFragment> {
  private final Provider<AllRegionRankPresenter> mPresenterProvider;

  public AllRegionRankFragment_MembersInjector(
      Provider<AllRegionRankPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<AllRegionRankFragment> create(
      Provider<AllRegionRankPresenter> mPresenterProvider) {
    return new AllRegionRankFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(AllRegionRankFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
