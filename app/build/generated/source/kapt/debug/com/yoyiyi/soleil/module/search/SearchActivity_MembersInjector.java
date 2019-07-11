package com.yoyiyi.soleil.module.search;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.search.SearchPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchActivity_MembersInjector implements MembersInjector<SearchActivity> {
  private final Provider<SearchPresenter> mPresenterProvider;

  public SearchActivity_MembersInjector(Provider<SearchPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SearchActivity> create(
      Provider<SearchPresenter> mPresenterProvider) {
    return new SearchActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SearchActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
