package com.yoyiyi.soleil.module.bangumi;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.bangumi.BangumiIndexPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BangumiIndexActivity_MembersInjector
    implements MembersInjector<BangumiIndexActivity> {
  private final Provider<BangumiIndexPresenter> mPresenterProvider;

  public BangumiIndexActivity_MembersInjector(Provider<BangumiIndexPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BangumiIndexActivity> create(
      Provider<BangumiIndexPresenter> mPresenterProvider) {
    return new BangumiIndexActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BangumiIndexActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
