package com.yoyiyi.soleil.module.discover;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.app.NothingPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InterestActivity_MembersInjector implements MembersInjector<InterestActivity> {
  private final Provider<NothingPresenter> mPresenterProvider;

  public InterestActivity_MembersInjector(Provider<NothingPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<InterestActivity> create(
      Provider<NothingPresenter> mPresenterProvider) {
    return new InterestActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(InterestActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
