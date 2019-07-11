package com.yoyiyi.soleil.module.home;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.home.DynamicPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DynamicFragment_MembersInjector implements MembersInjector<DynamicFragment> {
  private final Provider<DynamicPresenter> mPresenterProvider;

  public DynamicFragment_MembersInjector(Provider<DynamicPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<DynamicFragment> create(
      Provider<DynamicPresenter> mPresenterProvider) {
    return new DynamicFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(DynamicFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
