package com.yoyiyi.soleil.mvp.presenter.home;

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
public final class RegionPresenter_Factory implements Factory<RegionPresenter> {
  private final MembersInjector<RegionPresenter> regionPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public RegionPresenter_Factory(
      MembersInjector<RegionPresenter> regionPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert regionPresenterMembersInjector != null;
    this.regionPresenterMembersInjector = regionPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public RegionPresenter get() {
    return MembersInjectors.injectMembers(
        regionPresenterMembersInjector, new RegionPresenter(arg0Provider.get()));
  }

  public static Factory<RegionPresenter> create(
      MembersInjector<RegionPresenter> regionPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new RegionPresenter_Factory(regionPresenterMembersInjector, arg0Provider);
  }
}
