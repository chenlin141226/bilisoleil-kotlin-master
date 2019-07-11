package com.yoyiyi.soleil.di.component;

import android.app.Activity;
import com.yoyiyi.soleil.di.module.ActivityModule;
import com.yoyiyi.soleil.di.module.ActivityModule_ProvideActivityFactory;
import com.yoyiyi.soleil.module.SplashActivity;
import com.yoyiyi.soleil.module.SplashActivity_MembersInjector;
import com.yoyiyi.soleil.module.app.up.UpDetailActivity;
import com.yoyiyi.soleil.module.app.up.UpDetailActivity_MembersInjector;
import com.yoyiyi.soleil.module.app.video.VideoDetailActivity;
import com.yoyiyi.soleil.module.app.video.VideoDetailActivity_MembersInjector;
import com.yoyiyi.soleil.module.app.video.VideoPlayerActivity;
import com.yoyiyi.soleil.module.app.video.VideoPlayerActivity_MembersInjector;
import com.yoyiyi.soleil.module.bangumi.BangumiDetailActivity;
import com.yoyiyi.soleil.module.bangumi.BangumiDetailActivity_MembersInjector;
import com.yoyiyi.soleil.module.bangumi.BangumiIndexActivity;
import com.yoyiyi.soleil.module.bangumi.BangumiIndexActivity_MembersInjector;
import com.yoyiyi.soleil.module.bangumi.BangumiScheduleActivity;
import com.yoyiyi.soleil.module.bangumi.BangumiScheduleActivity_MembersInjector;
import com.yoyiyi.soleil.module.discover.ActivityCenterActivity;
import com.yoyiyi.soleil.module.discover.ActivityCenterActivity_MembersInjector;
import com.yoyiyi.soleil.module.discover.AllGameActivity;
import com.yoyiyi.soleil.module.discover.AllGameActivity_MembersInjector;
import com.yoyiyi.soleil.module.discover.GameCenterActivity;
import com.yoyiyi.soleil.module.discover.GameCenterActivity_MembersInjector;
import com.yoyiyi.soleil.module.discover.InterestActivity;
import com.yoyiyi.soleil.module.discover.InterestActivity_MembersInjector;
import com.yoyiyi.soleil.module.discover.TopicCenterActivity;
import com.yoyiyi.soleil.module.discover.TopicCenterActivity_MembersInjector;
import com.yoyiyi.soleil.module.recommend.AllStationRankActivity;
import com.yoyiyi.soleil.module.recommend.AllStationRankActivity_MembersInjector;
import com.yoyiyi.soleil.module.region.AdActivity;
import com.yoyiyi.soleil.module.region.AdActivity_MembersInjector;
import com.yoyiyi.soleil.module.region.AllRegionRankActivity;
import com.yoyiyi.soleil.module.region.AllRegionRankActivity_MembersInjector;
import com.yoyiyi.soleil.module.region.RegionTypeActivity;
import com.yoyiyi.soleil.module.region.RegionTypeActivity_MembersInjector;
import com.yoyiyi.soleil.module.search.SearchActivity;
import com.yoyiyi.soleil.module.search.SearchActivity_MembersInjector;
import com.yoyiyi.soleil.module.search.TotalSearchActivity;
import com.yoyiyi.soleil.module.search.TotalSearchActivity_MembersInjector;
import com.yoyiyi.soleil.mvp.presenter.app.NothingPresenter;
import com.yoyiyi.soleil.mvp.presenter.app.NothingPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.app.SplashPresenter;
import com.yoyiyi.soleil.mvp.presenter.app.SplashPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.app.up.UpDetailPresenter;
import com.yoyiyi.soleil.mvp.presenter.app.up.UpDetailPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.app.video.VideoDetailPresenter;
import com.yoyiyi.soleil.mvp.presenter.app.video.VideoDetailPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.app.video.VideoPlayerPresenter;
import com.yoyiyi.soleil.mvp.presenter.app.video.VideoPlayerPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.bangumi.BangumiDetailPresenter;
import com.yoyiyi.soleil.mvp.presenter.bangumi.BangumiDetailPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.bangumi.BangumiIndexPresenter;
import com.yoyiyi.soleil.mvp.presenter.bangumi.BangumiIndexPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.bangumi.BangumiSchedulePresenter;
import com.yoyiyi.soleil.mvp.presenter.bangumi.BangumiSchedulePresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.discover.ActivityCenterPresenter;
import com.yoyiyi.soleil.mvp.presenter.discover.ActivityCenterPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.discover.GameCenterPresenter;
import com.yoyiyi.soleil.mvp.presenter.discover.GameCenterPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.discover.TopicCenterPresenter;
import com.yoyiyi.soleil.mvp.presenter.discover.TopicCenterPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.region.AllRegionRankPositionPresenter;
import com.yoyiyi.soleil.mvp.presenter.region.AllRegionRankPositionPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.region.RegionTypeRecommendPresenter;
import com.yoyiyi.soleil.mvp.presenter.region.RegionTypeRecommendPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.search.SearchPresenter;
import com.yoyiyi.soleil.mvp.presenter.search.SearchPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.search.TotalSearchPresenter;
import com.yoyiyi.soleil.mvp.presenter.search.TotalSearchPresenter_Factory;
import com.yoyiyi.soleil.network.helper.RetrofitHelper;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<Activity> provideActivityProvider;

  private Provider<RetrofitHelper> getRetrofitHelperProvider;

  private Provider<SplashPresenter> splashPresenterProvider;

  private MembersInjector<SplashActivity> splashActivityMembersInjector;

  private Provider<RegionTypeRecommendPresenter> regionTypeRecommendPresenterProvider;

  private MembersInjector<AdActivity> adActivityMembersInjector;

  private Provider<AllRegionRankPositionPresenter> allRegionRankPositionPresenterProvider;

  private MembersInjector<RegionTypeActivity> regionTypeActivityMembersInjector;

  private Provider<NothingPresenter> nothingPresenterProvider;

  private MembersInjector<AllRegionRankActivity> allRegionRankActivityMembersInjector;

  private Provider<ActivityCenterPresenter> activityCenterPresenterProvider;

  private MembersInjector<ActivityCenterActivity> activityCenterActivityMembersInjector;

  private Provider<GameCenterPresenter> gameCenterPresenterProvider;

  private MembersInjector<AllGameActivity> allGameActivityMembersInjector;

  private MembersInjector<GameCenterActivity> gameCenterActivityMembersInjector;

  private MembersInjector<InterestActivity> interestActivityMembersInjector;

  private Provider<TopicCenterPresenter> topicCenterPresenterProvider;

  private MembersInjector<TopicCenterActivity> topicCenterActivityMembersInjector;

  private Provider<BangumiDetailPresenter> bangumiDetailPresenterProvider;

  private MembersInjector<BangumiDetailActivity> bangumiDetailActivityMembersInjector;

  private Provider<BangumiSchedulePresenter> bangumiSchedulePresenterProvider;

  private MembersInjector<BangumiScheduleActivity> bangumiScheduleActivityMembersInjector;

  private Provider<BangumiIndexPresenter> bangumiIndexPresenterProvider;

  private MembersInjector<BangumiIndexActivity> bangumiIndexActivityMembersInjector;

  private Provider<UpDetailPresenter> upDetailPresenterProvider;

  private MembersInjector<UpDetailActivity> upDetailActivityMembersInjector;

  private Provider<VideoPlayerPresenter> videoPlayerPresenterProvider;

  private MembersInjector<VideoPlayerActivity> videoPlayerActivityMembersInjector;

  private Provider<VideoDetailPresenter> videoDetailPresenterProvider;

  private MembersInjector<VideoDetailActivity> videoDetailActivityMembersInjector;

  private Provider<TotalSearchPresenter> totalSearchPresenterProvider;

  private MembersInjector<TotalSearchActivity> totalSearchActivityMembersInjector;

  private Provider<SearchPresenter> searchPresenterProvider;

  private MembersInjector<SearchActivity> searchActivityMembersInjector;

  private MembersInjector<AllStationRankActivity> allStationRankActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideActivityProvider =
        DoubleCheck.provider(ActivityModule_ProvideActivityFactory.create(builder.activityModule));

    this.getRetrofitHelperProvider =
        new com_yoyiyi_soleil_di_component_AppComponent_getRetrofitHelper(builder.appComponent);

    this.splashPresenterProvider =
        SplashPresenter_Factory.create(
            MembersInjectors.<SplashPresenter>noOp(), getRetrofitHelperProvider);

    this.splashActivityMembersInjector =
        SplashActivity_MembersInjector.create(splashPresenterProvider);

    this.regionTypeRecommendPresenterProvider =
        RegionTypeRecommendPresenter_Factory.create(
            MembersInjectors.<RegionTypeRecommendPresenter>noOp(), getRetrofitHelperProvider);

    this.adActivityMembersInjector =
        AdActivity_MembersInjector.create(regionTypeRecommendPresenterProvider);

    this.allRegionRankPositionPresenterProvider =
        AllRegionRankPositionPresenter_Factory.create(
            MembersInjectors.<AllRegionRankPositionPresenter>noOp());

    this.regionTypeActivityMembersInjector =
        RegionTypeActivity_MembersInjector.create(allRegionRankPositionPresenterProvider);

    this.nothingPresenterProvider =
        NothingPresenter_Factory.create(MembersInjectors.<NothingPresenter>noOp());

    this.allRegionRankActivityMembersInjector =
        AllRegionRankActivity_MembersInjector.create(nothingPresenterProvider);

    this.activityCenterPresenterProvider =
        ActivityCenterPresenter_Factory.create(
            MembersInjectors.<ActivityCenterPresenter>noOp(), getRetrofitHelperProvider);

    this.activityCenterActivityMembersInjector =
        ActivityCenterActivity_MembersInjector.create(activityCenterPresenterProvider);

    this.gameCenterPresenterProvider =
        GameCenterPresenter_Factory.create(MembersInjectors.<GameCenterPresenter>noOp());

    this.allGameActivityMembersInjector =
        AllGameActivity_MembersInjector.create(gameCenterPresenterProvider);

    this.gameCenterActivityMembersInjector =
        GameCenterActivity_MembersInjector.create(gameCenterPresenterProvider);

    this.interestActivityMembersInjector =
        InterestActivity_MembersInjector.create(nothingPresenterProvider);

    this.topicCenterPresenterProvider =
        TopicCenterPresenter_Factory.create(
            MembersInjectors.<TopicCenterPresenter>noOp(), getRetrofitHelperProvider);

    this.topicCenterActivityMembersInjector =
        TopicCenterActivity_MembersInjector.create(topicCenterPresenterProvider);

    this.bangumiDetailPresenterProvider =
        BangumiDetailPresenter_Factory.create(
            MembersInjectors.<BangumiDetailPresenter>noOp(), getRetrofitHelperProvider);

    this.bangumiDetailActivityMembersInjector =
        BangumiDetailActivity_MembersInjector.create(bangumiDetailPresenterProvider);

    this.bangumiSchedulePresenterProvider =
        BangumiSchedulePresenter_Factory.create(
            MembersInjectors.<BangumiSchedulePresenter>noOp(), getRetrofitHelperProvider);

    this.bangumiScheduleActivityMembersInjector =
        BangumiScheduleActivity_MembersInjector.create(bangumiSchedulePresenterProvider);

    this.bangumiIndexPresenterProvider =
        BangumiIndexPresenter_Factory.create(
            MembersInjectors.<BangumiIndexPresenter>noOp(), getRetrofitHelperProvider);

    this.bangumiIndexActivityMembersInjector =
        BangumiIndexActivity_MembersInjector.create(bangumiIndexPresenterProvider);

    this.upDetailPresenterProvider =
        UpDetailPresenter_Factory.create(
            MembersInjectors.<UpDetailPresenter>noOp(), getRetrofitHelperProvider);

    this.upDetailActivityMembersInjector =
        UpDetailActivity_MembersInjector.create(upDetailPresenterProvider);

    this.videoPlayerPresenterProvider =
        VideoPlayerPresenter_Factory.create(
            MembersInjectors.<VideoPlayerPresenter>noOp(), getRetrofitHelperProvider);

    this.videoPlayerActivityMembersInjector =
        VideoPlayerActivity_MembersInjector.create(videoPlayerPresenterProvider);

    this.videoDetailPresenterProvider =
        VideoDetailPresenter_Factory.create(
            MembersInjectors.<VideoDetailPresenter>noOp(), getRetrofitHelperProvider);

    this.videoDetailActivityMembersInjector =
        VideoDetailActivity_MembersInjector.create(videoDetailPresenterProvider);

    this.totalSearchPresenterProvider =
        TotalSearchPresenter_Factory.create(
            MembersInjectors.<TotalSearchPresenter>noOp(), getRetrofitHelperProvider);

    this.totalSearchActivityMembersInjector =
        TotalSearchActivity_MembersInjector.create(totalSearchPresenterProvider);

    this.searchPresenterProvider =
        SearchPresenter_Factory.create(
            MembersInjectors.<SearchPresenter>noOp(), getRetrofitHelperProvider);

    this.searchActivityMembersInjector =
        SearchActivity_MembersInjector.create(searchPresenterProvider);

    this.allStationRankActivityMembersInjector =
        AllStationRankActivity_MembersInjector.create(nothingPresenterProvider);
  }

  @Override
  public Activity getActivity() {
    return provideActivityProvider.get();
  }

  @Override
  public void inject(SplashActivity arg0) {
    splashActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(AdActivity arg0) {
    adActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(RegionTypeActivity arg0) {
    regionTypeActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(AllRegionRankActivity arg0) {
    allRegionRankActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(ActivityCenterActivity arg0) {
    activityCenterActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(AllGameActivity arg0) {
    allGameActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(GameCenterActivity arg0) {
    gameCenterActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(InterestActivity arg0) {
    interestActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(TopicCenterActivity arg0) {
    topicCenterActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(BangumiDetailActivity arg0) {
    bangumiDetailActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(BangumiScheduleActivity arg0) {
    bangumiScheduleActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(BangumiIndexActivity arg0) {
    bangumiIndexActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(UpDetailActivity arg0) {
    upDetailActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(VideoPlayerActivity arg0) {
    videoPlayerActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(VideoDetailActivity arg0) {
    videoDetailActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(TotalSearchActivity arg0) {
    totalSearchActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(SearchActivity arg0) {
    searchActivityMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(AllStationRankActivity arg0) {
    allStationRankActivityMembersInjector.injectMembers(arg0);
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private AppComponent appComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }

  private static class com_yoyiyi_soleil_di_component_AppComponent_getRetrofitHelper
      implements Provider<RetrofitHelper> {
    private final AppComponent appComponent;

    com_yoyiyi_soleil_di_component_AppComponent_getRetrofitHelper(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public RetrofitHelper get() {
      return Preconditions.checkNotNull(
          appComponent.getRetrofitHelper(),
          "Cannot return null from a non-@Nullable component method");
    }
  }
}
