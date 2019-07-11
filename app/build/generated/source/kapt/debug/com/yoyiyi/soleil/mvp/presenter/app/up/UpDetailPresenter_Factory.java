package com.yoyiyi.soleil.mvp.presenter.app.up;

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
public final class UpDetailPresenter_Factory implements Factory<UpDetailPresenter> {
  private final MembersInjector<UpDetailPresenter> upDetailPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public UpDetailPresenter_Factory(
      MembersInjector<UpDetailPresenter> upDetailPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert upDetailPresenterMembersInjector != null;
    this.upDetailPresenterMembersInjector = upDetailPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public UpDetailPresenter get() {
    return MembersInjectors.injectMembers(
        upDetailPresenterMembersInjector, new UpDetailPresenter(arg0Provider.get()));
  }

  public static Factory<UpDetailPresenter> create(
      MembersInjector<UpDetailPresenter> upDetailPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new UpDetailPresenter_Factory(upDetailPresenterMembersInjector, arg0Provider);
  }
}
