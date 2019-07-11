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
public final class RegionTypePresenter_Factory implements Factory<RegionTypePresenter> {
  private final MembersInjector<RegionTypePresenter> regionTypePresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public RegionTypePresenter_Factory(
      MembersInjector<RegionTypePresenter> regionTypePresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert regionTypePresenterMembersInjector != null;
    this.regionTypePresenterMembersInjector = regionTypePresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public RegionTypePresenter get() {
    return MembersInjectors.injectMembers(
        regionTypePresenterMembersInjector, new RegionTypePresenter(arg0Provider.get()));
  }

  public static Factory<RegionTypePresenter> create(
      MembersInjector<RegionTypePresenter> regionTypePresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new RegionTypePresenter_Factory(regionTypePresenterMembersInjector, arg0Provider);
  }
}
