package com.yoyiyi.soleil.module.app.video;

import com.yoyiyi.soleil.base.BaseInjectActivity;
import com.yoyiyi.soleil.mvp.presenter.app.video.VideoPlayerPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VideoPlayerActivity_MembersInjector
    implements MembersInjector<VideoPlayerActivity> {
  private final Provider<VideoPlayerPresenter> mPresenterProvider;

  public VideoPlayerActivity_MembersInjector(Provider<VideoPlayerPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<VideoPlayerActivity> create(
      Provider<VideoPlayerPresenter> mPresenterProvider) {
    return new VideoPlayerActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(VideoPlayerActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
