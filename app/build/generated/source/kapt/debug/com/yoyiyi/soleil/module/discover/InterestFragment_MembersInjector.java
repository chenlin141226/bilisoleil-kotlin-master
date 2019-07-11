package com.yoyiyi.soleil.module.discover;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.discover.InterestPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InterestFragment_MembersInjector implements MembersInjector<InterestFragment> {
  private final Provider<InterestPresenter> mPresenterProvider;

  public InterestFragment_MembersInjector(Provider<InterestPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<InterestFragment> create(
      Provider<InterestPresenter> mPresenterProvider) {
    return new InterestFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(InterestFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
