package com.yoyiyi.soleil.module.recommend;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.recommend.AllStationRankPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AllStationRankFragment_MembersInjector
    implements MembersInjector<AllStationRankFragment> {
  private final Provider<AllStationRankPresenter> mPresenterProvider;

  public AllStationRankFragment_MembersInjector(
      Provider<AllStationRankPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<AllStationRankFragment> create(
      Provider<AllStationRankPresenter> mPresenterProvider) {
    return new AllStationRankFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(AllStationRankFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
