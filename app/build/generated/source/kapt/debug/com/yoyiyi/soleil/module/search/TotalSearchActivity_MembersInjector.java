package com.yoyiyi.soleil.module.search;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.search.TotalSearchPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalSearchActivity_MembersInjector
    implements MembersInjector<TotalSearchActivity> {
  private final Provider<TotalSearchPresenter> mPresenterProvider;

  public TotalSearchActivity_MembersInjector(Provider<TotalSearchPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<TotalSearchActivity> create(
      Provider<TotalSearchPresenter> mPresenterProvider) {
    return new TotalSearchActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(TotalSearchActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
