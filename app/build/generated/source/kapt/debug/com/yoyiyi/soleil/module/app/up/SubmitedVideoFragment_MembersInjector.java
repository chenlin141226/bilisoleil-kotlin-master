package com.yoyiyi.soleil.module.app.up;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.app.up.SubmitedVideoPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubmitedVideoFragment_MembersInjector
    implements MembersInjector<SubmitedVideoFragment> {
  private final Provider<SubmitedVideoPresenter> mPresenterProvider;

  public SubmitedVideoFragment_MembersInjector(
      Provider<SubmitedVideoPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SubmitedVideoFragment> create(
      Provider<SubmitedVideoPresenter> mPresenterProvider) {
    return new SubmitedVideoFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SubmitedVideoFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
