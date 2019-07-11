package com.yoyiyi.soleil.mvp.presenter.app.up;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FavouritePresenter_Factory implements Factory<FavouritePresenter> {
  private final MembersInjector<FavouritePresenter> favouritePresenterMembersInjector;

  public FavouritePresenter_Factory(
      MembersInjector<FavouritePresenter> favouritePresenterMembersInjector) {
    assert favouritePresenterMembersInjector != null;
    this.favouritePresenterMembersInjector = favouritePresenterMembersInjector;
  }

  @Override
  public FavouritePresenter get() {
    return MembersInjectors.injectMembers(
        favouritePresenterMembersInjector, new FavouritePresenter());
  }

  public static Factory<FavouritePresenter> create(
      MembersInjector<FavouritePresenter> favouritePresenterMembersInjector) {
    return new FavouritePresenter_Factory(favouritePresenterMembersInjector);
  }
}
