package com.yoyiyi.soleil.module.search;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.search.ArchivePresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ArchiveFragment_MembersInjector implements MembersInjector<ArchiveFragment> {
  private final Provider<ArchivePresenter> mPresenterProvider;

  public ArchiveFragment_MembersInjector(Provider<ArchivePresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<ArchiveFragment> create(
      Provider<ArchivePresenter> mPresenterProvider) {
    return new ArchiveFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(ArchiveFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
