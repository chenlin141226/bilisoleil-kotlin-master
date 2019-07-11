package com.yoyiyi.soleil.module.region;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.region.RegionTypeRecommendPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdActivity_MembersInjector implements MembersInjector<AdActivity> {
  private final Provider<RegionTypeRecommendPresenter> mPresenterProvider;

  public AdActivity_MembersInjector(Provider<RegionTypeRecommendPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<AdActivity> create(
      Provider<RegionTypeRecommendPresenter> mPresenterProvider) {
    return new AdActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(AdActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
