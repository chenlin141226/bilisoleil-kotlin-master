package com.yoyiyi.soleil.module.home;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.home.RegionPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegionFragment_MembersInjector implements MembersInjector<RegionFragment> {
  private final Provider<RegionPresenter> mPresenterProvider;

  public RegionFragment_MembersInjector(Provider<RegionPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RegionFragment> create(
      Provider<RegionPresenter> mPresenterProvider) {
    return new RegionFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RegionFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
