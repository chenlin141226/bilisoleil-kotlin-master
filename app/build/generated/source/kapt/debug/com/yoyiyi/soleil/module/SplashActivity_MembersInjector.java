package com.yoyiyi.soleil.module;

import com.yoyiyi.soleil.mvp.presenter.app.SplashPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<SplashPresenter> mPresenterProvider;

  public SplashActivity_MembersInjector(Provider<SplashPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SplashActivity> create(
      Provider<SplashPresenter> mPresenterProvider) {
    return new SplashActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SplashActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }
}
