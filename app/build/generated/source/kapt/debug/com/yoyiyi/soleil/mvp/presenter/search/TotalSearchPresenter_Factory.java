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
public final class TotalSearchPresenter_Factory implements Factory<TotalSearchPresenter> {
  private final MembersInjector<TotalSearchPresenter> totalSearchPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public TotalSearchPresenter_Factory(
      MembersInjector<TotalSearchPresenter> totalSearchPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert totalSearchPresenterMembersInjector != null;
    this.totalSearchPresenterMembersInjector = totalSearchPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public TotalSearchPresenter get() {
    return MembersInjectors.injectMembers(
        totalSearchPresenterMembersInjector, new TotalSearchPresenter(arg0Provider.get()));
  }

  public static Factory<TotalSearchPresenter> create(
      MembersInjector<TotalSearchPresenter> totalSearchPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new TotalSearchPresenter_Factory(totalSearchPresenterMembersInjector, arg0Provider);
  }
}
