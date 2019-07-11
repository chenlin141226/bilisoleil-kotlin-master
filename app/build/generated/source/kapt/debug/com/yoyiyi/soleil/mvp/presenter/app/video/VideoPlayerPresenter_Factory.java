package com.yoyiyi.soleil.mvp.presenter.app.video;

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
public final class VideoPlayerPresenter_Factory implements Factory<VideoPlayerPresenter> {
  private final MembersInjector<VideoPlayerPresenter> videoPlayerPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public VideoPlayerPresenter_Factory(
      MembersInjector<VideoPlayerPresenter> videoPlayerPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert videoPlayerPresenterMembersInjector != null;
    this.videoPlayerPresenterMembersInjector = videoPlayerPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public VideoPlayerPresenter get() {
    return MembersInjectors.injectMembers(
        videoPlayerPresenterMembersInjector, new VideoPlayerPresenter(arg0Provider.get()));
  }

  public static Factory<VideoPlayerPresenter> create(
      MembersInjector<VideoPlayerPresenter> videoPlayerPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new VideoPlayerPresenter_Factory(videoPlayerPresenterMembersInjector, arg0Provider);
  }
}
