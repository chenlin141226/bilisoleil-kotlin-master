package com.yoyiyi.soleil.module.app.video;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.app.video.SummaryPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SummaryFragment_MembersInjector implements MembersInjector<SummaryFragment> {
  private final Provider<SummaryPresenter> mPresenterProvider;

  public SummaryFragment_MembersInjector(Provider<SummaryPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SummaryFragment> create(
      Provider<SummaryPresenter> mPresenterProvider) {
    return new SummaryFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SummaryFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
