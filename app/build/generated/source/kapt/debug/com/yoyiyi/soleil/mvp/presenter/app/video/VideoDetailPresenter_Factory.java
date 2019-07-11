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
public final class VideoDetailPresenter_Factory implements Factory<VideoDetailPresenter> {
  private final MembersInjector<VideoDetailPresenter> videoDetailPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public VideoDetailPresenter_Factory(
      MembersInjector<VideoDetailPresenter> videoDetailPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert videoDetailPresenterMembersInjector != null;
    this.videoDetailPresenterMembersInjector = videoDetailPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public VideoDetailPresenter get() {
    return MembersInjectors.injectMembers(
        videoDetailPresenterMembersInjector, new VideoDetailPresenter(arg0Provider.get()));
  }

  public static Factory<VideoDetailPresenter> create(
      MembersInjector<VideoDetailPresenter> videoDetailPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new VideoDetailPresenter_Factory(videoDetailPresenterMembersInjector, arg0Provider);
  }
}
