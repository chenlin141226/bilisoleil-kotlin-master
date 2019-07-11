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
public final class SearchPresenter_Factory implements Factory<SearchPresenter> {
  private final MembersInjector<SearchPresenter> searchPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public SearchPresenter_Factory(
      MembersInjector<SearchPresenter> searchPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert searchPresenterMembersInjector != null;
    this.searchPresenterMembersInjector = searchPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public SearchPresenter get() {
    return MembersInjectors.injectMembers(
        searchPresenterMembersInjector, new SearchPresenter(arg0Provider.get()));
  }

  public static Factory<SearchPresenter> create(
      MembersInjector<SearchPresenter> searchPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new SearchPresenter_Factory(searchPresenterMembersInjector, arg0Provider);
  }
}
