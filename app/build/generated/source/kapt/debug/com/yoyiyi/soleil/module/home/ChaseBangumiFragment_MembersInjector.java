package com.yoyiyi.soleil.module.home;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.home.ChaseBangumiPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChaseBangumiFragment_MembersInjector
    implements MembersInjector<ChaseBangumiFragment> {
  private final Provider<ChaseBangumiPresenter> mPresenterProvider;

  public ChaseBangumiFragment_MembersInjector(Provider<ChaseBangumiPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<ChaseBangumiFragment> create(
      Provider<ChaseBangumiPresenter> mPresenterProvider) {
    return new ChaseBangumiFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(ChaseBangumiFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
