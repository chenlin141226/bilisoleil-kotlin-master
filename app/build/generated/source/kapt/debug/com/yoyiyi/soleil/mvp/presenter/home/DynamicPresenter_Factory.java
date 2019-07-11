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
public final class DynamicPresenter_Factory implements Factory<DynamicPresenter> {
  private final MembersInjector<DynamicPresenter> dynamicPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public DynamicPresenter_Factory(
      MembersInjector<DynamicPresenter> dynamicPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert dynamicPresenterMembersInjector != null;
    this.dynamicPresenterMembersInjector = dynamicPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public DynamicPresenter get() {
    return MembersInjectors.injectMembers(
        dynamicPresenterMembersInjector, new DynamicPresenter(arg0Provider.get()));
  }

  public static Factory<DynamicPresenter> create(
      MembersInjector<DynamicPresenter> dynamicPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new DynamicPresenter_Factory(dynamicPresenterMembersInjector, arg0Provider);
  }
}
