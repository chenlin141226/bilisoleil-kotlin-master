package com.yoyiyi.soleil.module.app.video;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.app.video.VideoDetailPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VideoDetailActivity_MembersInjector
    implements MembersInjector<VideoDetailActivity> {
  private final Provider<VideoDetailPresenter> mPresenterProvider;

  public VideoDetailActivity_MembersInjector(Provider<VideoDetailPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<VideoDetailActivity> create(
      Provider<VideoDetailPresenter> mPresenterProvider) {
    return new VideoDetailActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(VideoDetailActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
