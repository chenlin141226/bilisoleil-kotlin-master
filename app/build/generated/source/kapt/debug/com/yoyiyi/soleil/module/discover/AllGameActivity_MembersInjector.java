package com.yoyiyi.soleil.module.discover;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.discover.GameCenterPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AllGameActivity_MembersInjector implements MembersInjector<AllGameActivity> {
  private final Provider<GameCenterPresenter> mPresenterProvider;

  public AllGameActivity_MembersInjector(Provider<GameCenterPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<AllGameActivity> create(
      Provider<GameCenterPresenter> mPresenterProvider) {
    return new AllGameActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(AllGameActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
