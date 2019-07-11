package com.yoyiyi.soleil.module.search;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.search.MoviePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovieFragment_MembersInjector implements MembersInjector<MovieFragment> {
  private final Provider<MoviePresenter> mPresenterProvider;

  public MovieFragment_MembersInjector(Provider<MoviePresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<MovieFragment> create(Provider<MoviePresenter> mPresenterProvider) {
    return new MovieFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(MovieFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
