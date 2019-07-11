package com.yoyiyi.soleil.module.home;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.home.DiscoverPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DiscoverFragment_MembersInjector implements MembersInjector<DiscoverFragment> {
  private final Provider<DiscoverPresenter> mPresenterProvider;

  public DiscoverFragment_MembersInjector(Provider<DiscoverPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<DiscoverFragment> create(
      Provider<DiscoverPresenter> mPresenterProvider) {
    return new DiscoverFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(DiscoverFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
