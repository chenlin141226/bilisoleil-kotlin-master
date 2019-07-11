package com.yoyiyi.soleil.mvp.presenter.app.video;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CommentPresenter_Factory implements Factory<CommentPresenter> {
  private final MembersInjector<CommentPresenter> commentPresenterMembersInjector;

  public CommentPresenter_Factory(
      MembersInjector<CommentPresenter> commentPresenterMembersInjector) {
    assert commentPresenterMembersInjector != null;
    this.commentPresenterMembersInjector = commentPresenterMembersInjector;
  }

  @Override
  public CommentPresenter get() {
    return MembersInjectors.injectMembers(commentPresenterMembersInjector, new CommentPresenter());
  }

  public static Factory<CommentPresenter> create(
      MembersInjector<CommentPresenter> commentPresenterMembersInjector) {
    return new CommentPresenter_Factory(commentPresenterMembersInjector);
  }
}
