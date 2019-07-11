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
public final class DiscoverPresenter_Factory implements Factory<DiscoverPresenter> {
  private final MembersInjector<DiscoverPresenter> discoverPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public DiscoverPresenter_Factory(
      MembersInjector<DiscoverPresenter> discoverPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert discoverPresenterMembersInjector != null;
    this.discoverPresenterMembersInjector = discoverPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public DiscoverPresenter get() {
    return MembersInjectors.injectMembers(
        discoverPresenterMembersInjector, new DiscoverPresenter(arg0Provider.get()));
  }

  public static Factory<DiscoverPresenter> create(
      MembersInjector<DiscoverPresenter> discoverPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new DiscoverPresenter_Factory(discoverPresenterMembersInjector, arg0Provider);
  }
}
