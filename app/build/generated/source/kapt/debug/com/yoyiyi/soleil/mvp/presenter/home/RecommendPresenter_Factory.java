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
public final class RecommendPresenter_Factory implements Factory<RecommendPresenter> {
  private final MembersInjector<RecommendPresenter> recommendPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public RecommendPresenter_Factory(
      MembersInjector<RecommendPresenter> recommendPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert recommendPresenterMembersInjector != null;
    this.recommendPresenterMembersInjector = recommendPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public RecommendPresenter get() {
    return MembersInjectors.injectMembers(
        recommendPresenterMembersInjector, new RecommendPresenter(arg0Provider.get()));
  }

  public static Factory<RecommendPresenter> create(
      MembersInjector<RecommendPresenter> recommendPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new RecommendPresenter_Factory(recommendPresenterMembersInjector, arg0Provider);
  }
}
