package com.yoyiyi.soleil.mvp.presenter.search;

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
public final class SeasonPresenter_Factory implements Factory<SeasonPresenter> {
  private final MembersInjector<SeasonPresenter> seasonPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public SeasonPresenter_Factory(
      MembersInjector<SeasonPresenter> seasonPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert seasonPresenterMembersInjector != null;
    this.seasonPresenterMembersInjector = seasonPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public SeasonPresenter get() {
    return MembersInjectors.injectMembers(
        seasonPresenterMembersInjector, new SeasonPresenter(arg0Provider.get()));
  }

  public static Factory<SeasonPresenter> create(
      MembersInjector<SeasonPresenter> seasonPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new SeasonPresenter_Factory(seasonPresenterMembersInjector, arg0Provider);
  }
}
