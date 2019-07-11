package com.yoyiyi.soleil.module.discover;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.discover.TopicCenterPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TopicCenterActivity_MembersInjector
    implements MembersInjector<TopicCenterActivity> {
  private final Provider<TopicCenterPresenter> mPresenterProvider;

  public TopicCenterActivity_MembersInjector(Provider<TopicCenterPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<TopicCenterActivity> create(
      Provider<TopicCenterPresenter> mPresenterProvider) {
    return new TopicCenterActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(TopicCenterActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
