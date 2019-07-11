package com.yoyiyi.soleil.di.component;

import android.app.Activity;
import com.yoyiyi.soleil.di.module.FragmentModule;
import com.yoyiyi.soleil.di.module.FragmentModule_ProvideActivityFactory;
import com.yoyiyi.soleil.module.app.up.ArchiveFragment;
import com.yoyiyi.soleil.module.app.up.ArchiveFragment_MembersInjector;
import com.yoyiyi.soleil.module.app.up.FavouriteFragment;
import com.yoyiyi.soleil.module.app.up.FavouriteFragment_MembersInjector;
import com.yoyiyi.soleil.module.app.up.SubmitedVideoFragment;
import com.yoyiyi.soleil.module.app.up.SubmitedVideoFragment_MembersInjector;
import com.yoyiyi.soleil.module.app.video.CommentFragment;
import com.yoyiyi.soleil.module.app.video.CommentFragment_MembersInjector;
import com.yoyiyi.soleil.module.app.video.SummaryFragment;
import com.yoyiyi.soleil.module.app.video.SummaryFragment_MembersInjector;
import com.yoyiyi.soleil.module.discover.InterestFragment;
import com.yoyiyi.soleil.module.discover.InterestFragment_MembersInjector;
import com.yoyiyi.soleil.module.home.ChaseBangumiFragment;
import com.yoyiyi.soleil.module.home.ChaseBangumiFragment_MembersInjector;
import com.yoyiyi.soleil.module.home.DiscoverFragment;
import com.yoyiyi.soleil.module.home.DiscoverFragment_MembersInjector;
import com.yoyiyi.soleil.module.home.DynamicFragment;
import com.yoyiyi.soleil.module.home.DynamicFragment_MembersInjector;
import com.yoyiyi.soleil.module.home.LiveFragment;
import com.yoyiyi.soleil.module.home.LiveFragment_MembersInjector;
import com.yoyiyi.soleil.module.home.RecommendFragment;
import com.yoyiyi.soleil.module.home.RecommendFragment_MembersInjector;
import com.yoyiyi.soleil.module.home.RegionFragment;
import com.yoyiyi.soleil.module.home.RegionFragment_MembersInjector;
import com.yoyiyi.soleil.module.recommend.AllStationRankFragment;
import com.yoyiyi.soleil.module.recommend.AllStationRankFragment_MembersInjector;
import com.yoyiyi.soleil.module.region.AllRegionRankFragment;
import com.yoyiyi.soleil.module.region.AllRegionRankFragment_MembersInjector;
import com.yoyiyi.soleil.module.region.RegionTypeFragment;
import com.yoyiyi.soleil.module.region.RegionTypeFragment_MembersInjector;
import com.yoyiyi.soleil.module.region.RegionTypeRecommendFragment;
import com.yoyiyi.soleil.module.region.RegionTypeRecommendFragment_MembersInjector;
import com.yoyiyi.soleil.module.search.MovieFragment;
import com.yoyiyi.soleil.module.search.MovieFragment_MembersInjector;
import com.yoyiyi.soleil.module.search.SeasonFragment;
import com.yoyiyi.soleil.module.search.SeasonFragment_MembersInjector;
import com.yoyiyi.soleil.module.search.UpFragment;
import com.yoyiyi.soleil.module.search.UpFragment_MembersInjector;
import com.yoyiyi.soleil.mvp.presenter.app.up.ArchivePresenter;
import com.yoyiyi.soleil.mvp.presenter.app.up.ArchivePresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.app.up.FavouritePresenter;
import com.yoyiyi.soleil.mvp.presenter.app.up.FavouritePresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.app.up.SubmitedVideoPresenter;
import com.yoyiyi.soleil.mvp.presenter.app.up.SubmitedVideoPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.app.video.CommentPresenter;
import com.yoyiyi.soleil.mvp.presenter.app.video.CommentPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.app.video.SummaryPresenter;
import com.yoyiyi.soleil.mvp.presenter.app.video.SummaryPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.discover.InterestPresenter;
import com.yoyiyi.soleil.mvp.presenter.discover.InterestPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.home.ChaseBangumiPresenter;
import com.yoyiyi.soleil.mvp.presenter.home.ChaseBangumiPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.home.DiscoverPresenter;
import com.yoyiyi.soleil.mvp.presenter.home.DiscoverPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.home.DynamicPresenter;
import com.yoyiyi.soleil.mvp.presenter.home.DynamicPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.home.LivePresenter;
import com.yoyiyi.soleil.mvp.presenter.home.LivePresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.home.RecommendPresenter;
import com.yoyiyi.soleil.mvp.presenter.home.RecommendPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.home.RegionPresenter;
import com.yoyiyi.soleil.mvp.presenter.home.RegionPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.recommend.AllStationRankPresenter;
import com.yoyiyi.soleil.mvp.presenter.recommend.AllStationRankPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.region.AllRegionRankPresenter;
import com.yoyiyi.soleil.mvp.presenter.region.AllRegionRankPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.region.RegionTypePresenter;
import com.yoyiyi.soleil.mvp.presenter.region.RegionTypePresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.region.RegionTypeRecommendPresenter;
import com.yoyiyi.soleil.mvp.presenter.region.RegionTypeRecommendPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.search.MoviePresenter;
import com.yoyiyi.soleil.mvp.presenter.search.MoviePresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.search.SeasonPresenter;
import com.yoyiyi.soleil.mvp.presenter.search.SeasonPresenter_Factory;
import com.yoyiyi.soleil.mvp.presenter.search.UpPresenter;
import com.yoyiyi.soleil.mvp.presenter.search.UpPresenter_Factory;
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
public final class DaggerFragmentComponent implements FragmentComponent {
  private Provider<Activity> provideActivityProvider;

  private Provider<RetrofitHelper> getRetrofitHelperProvider;

  private Provider<RecommendPresenter> recommendPresenterProvider;

  private MembersInjector<RecommendFragment> recommendFragmentMembersInjector;

  private Provider<LivePresenter> livePresenterProvider;

  private MembersInjector<LiveFragment> liveFragmentMembersInjector;

  private Provider<ChaseBangumiPresenter> chaseBangumiPresenterProvider;

  private MembersInjector<ChaseBangumiFragment> chaseBangumiFragmentMembersInjector;

  private Provider<RegionPresenter> regionPresenterProvider;

  private MembersInjector<RegionFragment> regionFragmentMembersInjector;

  private Provider<DynamicPresenter> dynamicPresenterProvider;

  private MembersInjector<DynamicFragment> dynamicFragmentMembersInjector;

  private Provider<DiscoverPresenter> discoverPresenterProvider;

  private MembersInjector<DiscoverFragment> discoverFragmentMembersInjector;

  private Provider<AllRegionRankPresenter> allRegionRankPresenterProvider;

  private MembersInjector<AllRegionRankFragment> allRegionRankFragmentMembersInjector;

  private Provider<RegionTypePresenter> regionTypePresenterProvider;

  private MembersInjector<RegionTypeFragment> regionTypeFragmentMembersInjector;

  private Provider<RegionTypeRecommendPresenter> regionTypeRecommendPresenterProvider;

  private MembersInjector<RegionTypeRecommendFragment> regionTypeRecommendFragmentMembersInjector;

  private Provider<InterestPresenter> interestPresenterProvider;

  private MembersInjector<InterestFragment> interestFragmentMembersInjector;

  private Provider<AllStationRankPresenter> allStationRankPresenterProvider;

  private MembersInjector<AllStationRankFragment> allStationRankFragmentMembersInjector;

  private Provider<ArchivePresenter> archivePresenterProvider;

  private MembersInjector<ArchiveFragment> archiveFragmentMembersInjector;

  private Provider<FavouritePresenter> favouritePresenterProvider;

  private MembersInjector<FavouriteFragment> favouriteFragmentMembersInjector;

  private Provider<SubmitedVideoPresenter> submitedVideoPresenterProvider;

  private MembersInjector<SubmitedVideoFragment> submitedVideoFragmentMembersInjector;

  private Provider<CommentPresenter> commentPresenterProvider;

  private MembersInjector<CommentFragment> commentFragmentMembersInjector;

  private Provider<SummaryPresenter> summaryPresenterProvider;

  private MembersInjector<SummaryFragment> summaryFragmentMembersInjector;

  private Provider<UpPresenter> upPresenterProvider;

  private MembersInjector<UpFragment> upFragmentMembersInjector;

  private Provider<SeasonPresenter> seasonPresenterProvider;

  private MembersInjector<SeasonFragment> seasonFragmentMembersInjector;

  private Provider<MoviePresenter> moviePresenterProvider;

  private MembersInjector<MovieFragment> movieFragmentMembersInjector;

  private Provider<com.yoyiyi.soleil.mvp.presenter.search.ArchivePresenter>
      archivePresenterProvider2;

  private MembersInjector<com.yoyiyi.soleil.module.search.ArchiveFragment>
      archiveFragmentMembersInjector2;

  private DaggerFragmentComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideActivityProvider =
        DoubleCheck.provider(FragmentModule_ProvideActivityFactory.create(builder.fragmentModule));

    this.getRetrofitHelperProvider =
        new com_yoyiyi_soleil_di_component_AppComponent_getRetrofitHelper(builder.appComponent);

    this.recommendPresenterProvider =
        RecommendPresenter_Factory.create(
            MembersInjectors.<RecommendPresenter>noOp(), getRetrofitHelperProvider);

    this.recommendFragmentMembersInjector =
        RecommendFragment_MembersInjector.create(recommendPresenterProvider);

    this.livePresenterProvider =
        LivePresenter_Factory.create(
            MembersInjectors.<LivePresenter>noOp(), getRetrofitHelperProvider);

    this.liveFragmentMembersInjector = LiveFragment_MembersInjector.create(livePresenterProvider);

    this.chaseBangumiPresenterProvider =
        ChaseBangumiPresenter_Factory.create(
            MembersInjectors.<ChaseBangumiPresenter>noOp(), getRetrofitHelperProvider);

    this.chaseBangumiFragmentMembersInjector =
        ChaseBangumiFragment_MembersInjector.create(chaseBangumiPresenterProvider);

    this.regionPresenterProvider =
        RegionPresenter_Factory.create(
            MembersInjectors.<RegionPresenter>noOp(), getRetrofitHelperProvider);

    this.regionFragmentMembersInjector =
        RegionFragment_MembersInjector.create(regionPresenterProvider);

    this.dynamicPresenterProvider =
        DynamicPresenter_Factory.create(
            MembersInjectors.<DynamicPresenter>noOp(), getRetrofitHelperProvider);

    this.dynamicFragmentMembersInjector =
        DynamicFragment_MembersInjector.create(dynamicPresenterProvider);

    this.discoverPresenterProvider =
        DiscoverPresenter_Factory.create(
            MembersInjectors.<DiscoverPresenter>noOp(), getRetrofitHelperProvider);

    this.discoverFragmentMembersInjector =
        DiscoverFragment_MembersInjector.create(discoverPresenterProvider);

    this.allRegionRankPresenterProvider =
        AllRegionRankPresenter_Factory.create(
            MembersInjectors.<AllRegionRankPresenter>noOp(), getRetrofitHelperProvider);

    this.allRegionRankFragmentMembersInjector =
        AllRegionRankFragment_MembersInjector.create(allRegionRankPresenterProvider);

    this.regionTypePresenterProvider =
        RegionTypePresenter_Factory.create(
            MembersInjectors.<RegionTypePresenter>noOp(), getRetrofitHelperProvider);

    this.regionTypeFragmentMembersInjector =
        RegionTypeFragment_MembersInjector.create(regionTypePresenterProvider);

    this.regionTypeRecommendPresenterProvider =
        RegionTypeRecommendPresenter_Factory.create(
            MembersInjectors.<RegionTypeRecommendPresenter>noOp(), getRetrofitHelperProvider);

    this.regionTypeRecommendFragmentMembersInjector =
        RegionTypeRecommendFragment_MembersInjector.create(regionTypeRecommendPresenterProvider);

    this.interestPresenterProvider =
        InterestPresenter_Factory.create(
            MembersInjectors.<InterestPresenter>noOp(), getRetrofitHelperProvider);

    this.interestFragmentMembersInjector =
        InterestFragment_MembersInjector.create(interestPresenterProvider);

    this.allStationRankPresenterProvider =
        AllStationRankPresenter_Factory.create(
            MembersInjectors.<AllStationRankPresenter>noOp(), getRetrofitHelperProvider);

    this.allStationRankFragmentMembersInjector =
        AllStationRankFragment_MembersInjector.create(allStationRankPresenterProvider);

    this.archivePresenterProvider =
        ArchivePresenter_Factory.create(MembersInjectors.<ArchivePresenter>noOp());

    this.archiveFragmentMembersInjector =
        ArchiveFragment_MembersInjector.create(archivePresenterProvider);

    this.favouritePresenterProvider =
        FavouritePresenter_Factory.create(MembersInjectors.<FavouritePresenter>noOp());

    this.favouriteFragmentMembersInjector =
        FavouriteFragment_MembersInjector.create(favouritePresenterProvider);

    this.submitedVideoPresenterProvider =
        SubmitedVideoPresenter_Factory.create(MembersInjectors.<SubmitedVideoPresenter>noOp());

    this.submitedVideoFragmentMembersInjector =
        SubmitedVideoFragment_MembersInjector.create(submitedVideoPresenterProvider);

    this.commentPresenterProvider =
        CommentPresenter_Factory.create(MembersInjectors.<CommentPresenter>noOp());

    this.commentFragmentMembersInjector =
        CommentFragment_MembersInjector.create(commentPresenterProvider);

    this.summaryPresenterProvider =
        SummaryPresenter_Factory.create(MembersInjectors.<SummaryPresenter>noOp());

    this.summaryFragmentMembersInjector =
        SummaryFragment_MembersInjector.create(summaryPresenterProvider);

    this.upPresenterProvider =
        UpPresenter_Factory.create(MembersInjectors.<UpPresenter>noOp(), getRetrofitHelperProvider);

    this.upFragmentMembersInjector = UpFragment_MembersInjector.create(upPresenterProvider);

    this.seasonPresenterProvider =
        SeasonPresenter_Factory.create(
            MembersInjectors.<SeasonPresenter>noOp(), getRetrofitHelperProvider);

    this.seasonFragmentMembersInjector =
        SeasonFragment_MembersInjector.create(seasonPresenterProvider);

    this.moviePresenterProvider =
        MoviePresenter_Factory.create(
            MembersInjectors.<MoviePresenter>noOp(), getRetrofitHelperProvider);

    this.movieFragmentMembersInjector =
        MovieFragment_MembersInjector.create(moviePresenterProvider);

    this.archivePresenterProvider2 =
        com.yoyiyi.soleil.mvp.presenter.search.ArchivePresenter_Factory.create(
            MembersInjectors.<com.yoyiyi.soleil.mvp.presenter.search.ArchivePresenter>noOp());

    this.archiveFragmentMembersInjector2 =
        com.yoyiyi.soleil.module.search.ArchiveFragment_MembersInjector.create(
            archivePresenterProvider2);
  }

  @Override
  public Activity getActivity() {
    return provideActivityProvider.get();
  }

  @Override
  public void inject(RecommendFragment arg0) {
    recommendFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(LiveFragment arg0) {
    liveFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(ChaseBangumiFragment arg0) {
    chaseBangumiFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(RegionFragment arg0) {
    regionFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(DynamicFragment arg0) {
    dynamicFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(DiscoverFragment arg0) {
    discoverFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(AllRegionRankFragment arg0) {
    allRegionRankFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(RegionTypeFragment arg0) {
    regionTypeFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(RegionTypeRecommendFragment arg0) {
    regionTypeRecommendFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(InterestFragment arg0) {
    interestFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(AllStationRankFragment arg0) {
    allStationRankFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(ArchiveFragment arg0) {
    archiveFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(FavouriteFragment arg0) {
    favouriteFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(SubmitedVideoFragment arg0) {
    submitedVideoFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(CommentFragment arg0) {
    commentFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(SummaryFragment arg0) {
    summaryFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(UpFragment arg0) {
    upFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(SeasonFragment arg0) {
    seasonFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(MovieFragment arg0) {
    movieFragmentMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(com.yoyiyi.soleil.module.search.ArchiveFragment arg0) {
    archiveFragmentMembersInjector2.injectMembers(arg0);
  }

  public static final class Builder {
    private FragmentModule fragmentModule;

    private AppComponent appComponent;

    private Builder() {}

    public FragmentComponent build() {
      if (fragmentModule == null) {
        throw new IllegalStateException(FragmentModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerFragmentComponent(this);
    }

    public Builder fragmentModule(FragmentModule fragmentModule) {
      this.fragmentModule = Preconditions.checkNotNull(fragmentModule);
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
