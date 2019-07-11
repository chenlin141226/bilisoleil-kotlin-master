package com.yoyiyi.soleil.mvp.presenter.app;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NothingPresenter_Factory implements Factory<NothingPresenter> {
  private final MembersInjector<NothingPresenter> nothingPresenterMembersInjector;

  public NothingPresenter_Factory(
      MembersInjector<NothingPresenter> nothingPresenterMembersInjector) {
    assert nothingPresenterMembersInjector != null;
    this.nothingPresenterMembersInjector = nothingPresenterMembersInjector;
  }

  @Override
  public NothingPresenter get() {
    return MembersInjectors.injectMembers(nothingPresenterMembersInjector, new NothingPresenter());
  }

  public static Factory<NothingPresenter> create(
      MembersInjector<NothingPresenter> nothingPresenterMembersInjector) {
    return new NothingPresenter_Factory(nothingPresenterMembersInjector);
  }
}
