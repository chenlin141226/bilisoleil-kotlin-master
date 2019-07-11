package com.yoyiyi.soleil.mvp.presenter.region;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AllRegionRankPositionPresenter_Factory
    implements Factory<AllRegionRankPositionPresenter> {
  private final MembersInjector<AllRegionRankPositionPresenter>
      allRegionRankPositionPresenterMembersInjector;

  public AllRegionRankPositionPresenter_Factory(
      MembersInjector<AllRegionRankPositionPresenter>
          allRegionRankPositionPresenterMembersInjector) {
    assert allRegionRankPositionPresenterMembersInjector != null;
    this.allRegionRankPositionPresenterMembersInjector =
        allRegionRankPositionPresenterMembersInjector;
  }

  @Override
  public AllRegionRankPositionPresenter get() {
    return MembersInjectors.injectMembers(
        allRegionRankPositionPresenterMembersInjector, new AllRegionRankPositionPresenter());
  }

  public static Factory<AllRegionRankPositionPresenter> create(
      MembersInjector<AllRegionRankPositionPresenter>
          allRegionRankPositionPresenterMembersInjector) {
    return new AllRegionRankPositionPresenter_Factory(
        allRegionRankPositionPresenterMembersInjector);
  }
}
