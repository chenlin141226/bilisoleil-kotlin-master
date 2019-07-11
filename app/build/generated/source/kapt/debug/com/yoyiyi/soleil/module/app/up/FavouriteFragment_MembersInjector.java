package com.yoyiyi.soleil.module.app.up;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.app.up.FavouritePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FavouriteFragment_MembersInjector implements MembersInjector<FavouriteFragment> {
  private final Provider<FavouritePresenter> mPresenterProvider;

  public FavouriteFragment_MembersInjector(Provider<FavouritePresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<FavouriteFragment> create(
      Provider<FavouritePresenter> mPresenterProvider) {
    return new FavouriteFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(FavouriteFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
