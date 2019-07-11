package com.yoyiyi.soleil.mvp.presenter.search;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ArchivePresenter_Factory implements Factory<ArchivePresenter> {
  private final MembersInjector<ArchivePresenter> archivePresenterMembersInjector;

  public ArchivePresenter_Factory(
      MembersInjector<ArchivePresenter> archivePresenterMembersInjector) {
    assert archivePresenterMembersInjector != null;
    this.archivePresenterMembersInjector = archivePresenterMembersInjector;
  }

  @Override
  public ArchivePresenter get() {
    return MembersInjectors.injectMembers(archivePresenterMembersInjector, new ArchivePresenter());
  }

  public static Factory<ArchivePresenter> create(
      MembersInjector<ArchivePresenter> archivePresenterMembersInjector) {
    return new ArchivePresenter_Factory(archivePresenterMembersInjector);
  }
}
