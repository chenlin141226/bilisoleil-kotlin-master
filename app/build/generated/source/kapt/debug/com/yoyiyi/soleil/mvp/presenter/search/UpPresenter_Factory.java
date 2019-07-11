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
public final class UpPresenter_Factory implements Factory<UpPresenter> {
  private final MembersInjector<UpPresenter> upPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public UpPresenter_Factory(
      MembersInjector<UpPresenter> upPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert upPresenterMembersInjector != null;
    this.upPresenterMembersInjector = upPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public UpPresenter get() {
    return MembersInjectors.injectMembers(
        upPresenterMembersInjector, new UpPresenter(arg0Provider.get()));
  }

  public static Factory<UpPresenter> create(
      MembersInjector<UpPresenter> upPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new UpPresenter_Factory(upPresenterMembersInjector, arg0Provider);
  }
}
