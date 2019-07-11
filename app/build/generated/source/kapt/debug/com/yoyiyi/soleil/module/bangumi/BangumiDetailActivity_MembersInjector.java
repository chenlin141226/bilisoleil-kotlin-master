package com.yoyiyi.soleil.module.bangumi;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.bangumi.BangumiDetailPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BangumiDetailActivity_MembersInjector
    implements MembersInjector<BangumiDetailActivity> {
  private final Provider<BangumiDetailPresenter> mPresenterProvider;

  public BangumiDetailActivity_MembersInjector(
      Provider<BangumiDetailPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<BangumiDetailActivity> create(
      Provider<BangumiDetailPresenter> mPresenterProvider) {
    return new BangumiDetailActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(BangumiDetailActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
