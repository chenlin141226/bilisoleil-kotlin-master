package com.yoyiyi.soleil.mvp.presenter.region;

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
public final class AllRegionRankPresenter_Factory implements Factory<AllRegionRankPresenter> {
  private final MembersInjector<AllRegionRankPresenter> allRegionRankPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public AllRegionRankPresenter_Factory(
      MembersInjector<AllRegionRankPresenter> allRegionRankPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert allRegionRankPresenterMembersInjector != null;
    this.allRegionRankPresenterMembersInjector = allRegionRankPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public AllRegionRankPresenter get() {
    return MembersInjectors.injectMembers(
        allRegionRankPresenterMembersInjector, new AllRegionRankPresenter(arg0Provider.get()));
  }

  public static Factory<AllRegionRankPresenter> create(
      MembersInjector<AllRegionRankPresenter> allRegionRankPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new AllRegionRankPresenter_Factory(allRegionRankPresenterMembersInjector, arg0Provider);
  }
}
