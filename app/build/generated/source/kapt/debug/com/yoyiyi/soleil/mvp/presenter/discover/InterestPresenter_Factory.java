package com.yoyiyi.soleil.mvp.presenter.discover;

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
public final class InterestPresenter_Factory implements Factory<InterestPresenter> {
  private final MembersInjector<InterestPresenter> interestPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public InterestPresenter_Factory(
      MembersInjector<InterestPresenter> interestPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert interestPresenterMembersInjector != null;
    this.interestPresenterMembersInjector = interestPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public InterestPresenter get() {
    return MembersInjectors.injectMembers(
        interestPresenterMembersInjector, new InterestPresenter(arg0Provider.get()));
  }

  public static Factory<InterestPresenter> create(
      MembersInjector<InterestPresenter> interestPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new InterestPresenter_Factory(interestPresenterMembersInjector, arg0Provider);
  }
}
