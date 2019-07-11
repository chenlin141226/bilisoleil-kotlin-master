package com.yoyiyi.soleil.mvp.presenter.app.video;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SummaryPresenter_Factory implements Factory<SummaryPresenter> {
  private final MembersInjector<SummaryPresenter> summaryPresenterMembersInjector;

  public SummaryPresenter_Factory(
      MembersInjector<SummaryPresenter> summaryPresenterMembersInjector) {
    assert summaryPresenterMembersInjector != null;
    this.summaryPresenterMembersInjector = summaryPresenterMembersInjector;
  }

  @Override
  public SummaryPresenter get() {
    return MembersInjectors.injectMembers(summaryPresenterMembersInjector, new SummaryPresenter());
  }

  public static Factory<SummaryPresenter> create(
      MembersInjector<SummaryPresenter> summaryPresenterMembersInjector) {
    return new SummaryPresenter_Factory(summaryPresenterMembersInjector);
  }
}
