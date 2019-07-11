package com.yoyiyi.soleil.mvp.presenter.app.up;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubmitedVideoPresenter_Factory implements Factory<SubmitedVideoPresenter> {
  private final MembersInjector<SubmitedVideoPresenter> submitedVideoPresenterMembersInjector;

  public SubmitedVideoPresenter_Factory(
      MembersInjector<SubmitedVideoPresenter> submitedVideoPresenterMembersInjector) {
    assert submitedVideoPresenterMembersInjector != null;
    this.submitedVideoPresenterMembersInjector = submitedVideoPresenterMembersInjector;
  }

  @Override
  public SubmitedVideoPresenter get() {
    return MembersInjectors.injectMembers(
        submitedVideoPresenterMembersInjector, new SubmitedVideoPresenter());
  }

  public static Factory<SubmitedVideoPresenter> create(
      MembersInjector<SubmitedVideoPresenter> submitedVideoPresenterMembersInjector) {
    return new SubmitedVideoPresenter_Factory(submitedVideoPresenterMembersInjector);
  }
}
