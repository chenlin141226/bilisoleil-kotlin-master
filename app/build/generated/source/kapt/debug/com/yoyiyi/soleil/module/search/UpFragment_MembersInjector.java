package com.yoyiyi.soleil.module.search;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.search.UpPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpFragment_MembersInjector implements MembersInjector<UpFragment> {
  private final Provider<UpPresenter> mPresenterProvider;

  public UpFragment_MembersInjector(Provider<UpPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<UpFragment> create(Provider<UpPresenter> mPresenterProvider) {
    return new UpFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(UpFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
