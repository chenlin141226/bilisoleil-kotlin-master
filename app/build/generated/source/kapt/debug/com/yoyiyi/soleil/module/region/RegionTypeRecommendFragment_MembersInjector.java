package com.yoyiyi.soleil.module.region;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.region.RegionTypeRecommendPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegionTypeRecommendFragment_MembersInjector
    implements MembersInjector<RegionTypeRecommendFragment> {
  private final Provider<RegionTypeRecommendPresenter> mPresenterProvider;

  public RegionTypeRecommendFragment_MembersInjector(
      Provider<RegionTypeRecommendPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RegionTypeRecommendFragment> create(
      Provider<RegionTypeRecommendPresenter> mPresenterProvider) {
    return new RegionTypeRecommendFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RegionTypeRecommendFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
