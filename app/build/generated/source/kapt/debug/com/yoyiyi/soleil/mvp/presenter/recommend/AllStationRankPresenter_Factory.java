package com.yoyiyi.soleil.mvp.presenter.recommend;

import com.yoyiyi.soleil.network.helper.RetrofitHelper;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AllStationRankPresenter_Factory implements Factory<AllStationRankPresenter> {
  private final MembersInjector<AllStationRankPresenter> allStationRankPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public AllStationRankPresenter_Factory(
      MembersInjector<AllStationRankPresenter> allStationRankPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert allStationRankPresenterMembersInjector != null;
    this.allStationRankPresenterMembersInjector = allStationRankPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public AllStationRankPresenter get() {
    return MembersInjectors.injectMembers(
        allStationRankPresenterMembersInjector, new AllStationRankPresenter(arg0Provider.get()));
  }

  public static Factory<AllStationRankPresenter> create(
      MembersInjector<AllStationRankPresenter> allStationRankPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new AllStationRankPresenter_Factory(
        allStationRankPresenterMembersInjector, arg0Provider);
  }
}
