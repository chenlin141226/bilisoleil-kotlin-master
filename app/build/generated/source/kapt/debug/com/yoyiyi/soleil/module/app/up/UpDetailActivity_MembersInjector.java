package com.yoyiyi.soleil.module.app.up;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.app.up.UpDetailPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpDetailActivity_MembersInjector implements MembersInjector<UpDetailActivity> {
  private final Provider<UpDetailPresenter> mPresenterProvider;

  public UpDetailActivity_MembersInjector(Provider<UpDetailPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<UpDetailActivity> create(
      Provider<UpDetailPresenter> mPresenterProvider) {
    return new UpDetailActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(UpDetailActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
