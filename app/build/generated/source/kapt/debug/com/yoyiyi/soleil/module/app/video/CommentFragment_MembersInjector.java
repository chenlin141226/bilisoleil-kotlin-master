package com.yoyiyi.soleil.module.app.video;

import com.yoyiyi.soleil.base.BaseInjectFragment;
import com.yoyiyi.soleil.mvp.presenter.app.video.CommentPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CommentFragment_MembersInjector implements MembersInjector<CommentFragment> {
  private final Provider<CommentPresenter> mPresenterProvider;

  public CommentFragment_MembersInjector(Provider<CommentPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<CommentFragment> create(
      Provider<CommentPresenter> mPresenterProvider) {
    return new CommentFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(CommentFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
