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
public final class MoviePresenter_Factory implements Factory<MoviePresenter> {
  private final MembersInjector<MoviePresenter> moviePresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public MoviePresenter_Factory(
      MembersInjector<MoviePresenter> moviePresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert moviePresenterMembersInjector != null;
    this.moviePresenterMembersInjector = moviePresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public MoviePresenter get() {
    return MembersInjectors.injectMembers(
        moviePresenterMembersInjector, new MoviePresenter(arg0Provider.get()));
  }

  public static Factory<MoviePresenter> create(
      MembersInjector<MoviePresenter> moviePresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new MoviePresenter_Factory(moviePresenterMembersInjector, arg0Provider);
  }
}
