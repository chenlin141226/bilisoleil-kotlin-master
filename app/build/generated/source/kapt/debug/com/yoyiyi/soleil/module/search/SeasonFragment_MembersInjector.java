package com.yoyiyi.soleil.module.search;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.search.SeasonPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SeasonFragment_MembersInjector implements MembersInjector<SeasonFragment> {
  private final Provider<SeasonPresenter> mPresenterProvider;

  public SeasonFragment_MembersInjector(Provider<SeasonPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SeasonFragment> create(
      Provider<SeasonPresenter> mPresenterProvider) {
    return new SeasonFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SeasonFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
