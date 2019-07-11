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
public final class LivePresenter_Factory implements Factory<LivePresenter> {
  private final MembersInjector<LivePresenter> livePresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public LivePresenter_Factory(
      MembersInjector<LivePresenter> livePresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert livePresenterMembersInjector != null;
    this.livePresenterMembersInjector = livePresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public LivePresenter get() {
    return MembersInjectors.injectMembers(
        livePresenterMembersInjector, new LivePresenter(arg0Provider.get()));
  }

  public static Factory<LivePresenter> create(
      MembersInjector<LivePresenter> livePresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new LivePresenter_Factory(livePresenterMembersInjector, arg0Provider);
  }
}
