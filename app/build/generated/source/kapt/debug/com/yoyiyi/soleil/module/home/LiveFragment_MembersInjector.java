package com.yoyiyi.soleil.module.home;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.home.LivePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LiveFragment_MembersInjector implements MembersInjector<LiveFragment> {
  private final Provider<LivePresenter> mPresenterProvider;

  public LiveFragment_MembersInjector(Provider<LivePresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<LiveFragment> create(Provider<LivePresenter> mPresenterProvider) {
    return new LiveFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(LiveFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
