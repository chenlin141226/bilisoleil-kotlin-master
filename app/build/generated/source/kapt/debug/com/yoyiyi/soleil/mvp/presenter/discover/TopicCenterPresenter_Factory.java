package com.yoyiyi.soleil.mvp.presenter.discover;

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
public final class TopicCenterPresenter_Factory implements Factory<TopicCenterPresenter> {
  private final MembersInjector<TopicCenterPresenter> topicCenterPresenterMembersInjector;

  private final Provider<RetrofitHelper> arg0Provider;

  public TopicCenterPresenter_Factory(
      MembersInjector<TopicCenterPresenter> topicCenterPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    assert topicCenterPresenterMembersInjector != null;
    this.topicCenterPresenterMembersInjector = topicCenterPresenterMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public TopicCenterPresenter get() {
    return MembersInjectors.injectMembers(
        topicCenterPresenterMembersInjector, new TopicCenterPresenter(arg0Provider.get()));
  }

  public static Factory<TopicCenterPresenter> create(
      MembersInjector<TopicCenterPresenter> topicCenterPresenterMembersInjector,
      Provider<RetrofitHelper> arg0Provider) {
    return new TopicCenterPresenter_Factory(topicCenterPresenterMembersInjector, arg0Provider);
  }
}
