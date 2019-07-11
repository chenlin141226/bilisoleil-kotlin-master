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
public final class RegionTypeRecommendPresenter_Factory
    implements Factory<RegionTypeRecommendPresenter> {
  private final MembersInjector<RegionTypeRecommendPresenter>
      regionTypeRecommendPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public RegionTypeRecommendPresenter_Factory(
      MembersInjector<RegionTypeRecommendPresenter> regionTypeRecommendPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert regionTypeRecommendPresenterMembersInjector != null;
    this.regionTypeRecommendPresenterMembersInjector = regionTypeRecommendPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public RegionTypeRecommendPresenter get() {
    return MembersInjectors.injectMembers(
        regionTypeRecommendPresenterMembersInjector,
        new RegionTypeRecommendPresenter(arg0Provider.get()));
  }

  public static Factory<RegionTypeRecommendPresenter> create(
      MembersInjector<RegionTypeRecommendPresenter> regionTypeRecommendPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new RegionTypeRecommendPresenter_Factory(
        regionTypeRecommendPresenterMembersInjector, arg0Provider);
  }
}
