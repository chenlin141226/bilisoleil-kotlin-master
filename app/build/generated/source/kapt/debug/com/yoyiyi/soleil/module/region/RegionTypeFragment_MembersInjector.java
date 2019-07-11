package com.yoyiyi.soleil.module.region;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.region.RegionTypePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegionTypeFragment_MembersInjector
    implements MembersInjector<RegionTypeFragment> {
  private final Provider<RegionTypePresenter> mPresenterProvider;

  public RegionTypeFragment_MembersInjector(Provider<RegionTypePresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RegionTypeFragment> create(
      Provider<RegionTypePresenter> mPresenterProvider) {
    return new RegionTypeFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RegionTypeFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
