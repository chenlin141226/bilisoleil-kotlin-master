package com.yoyiyi.soleil.module.home;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.home.RecommendPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecommendFragment_MembersInjector implements MembersInjector<RecommendFragment> {
  private final Provider<RecommendPresenter> mPresenterProvider;

  public RecommendFragment_MembersInjector(Provider<RecommendPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RecommendFragment> create(
      Provider<RecommendPresenter> mPresenterProvider) {
    return new RecommendFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RecommendFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
