package com.yoyiyi.soleil.mvp.presenter.discover;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GameCenterPresenter_Factory implements Factory<GameCenterPresenter> {
  private final MembersInjector<GameCenterPresenter> gameCenterPresenterMembersInjector;

  public GameCenterPresenter_Factory(
      MembersInjector<GameCenterPresenter> gameCenterPresenterMembersInjector) {
    assert gameCenterPresenterMembersInjector != null;
    this.gameCenterPresenterMembersInjector = gameCenterPresenterMembersInjector;
  }

  @Override
  public GameCenterPresenter get() {
    return MembersInjectors.injectMembers(
        gameCenterPresenterMembersInjector, new GameCenterPresenter());
  }

  public static Factory<GameCenterPresenter> create(
      MembersInjector<GameCenterPresenter> gameCenterPresenterMembersInjector) {
    return new GameCenterPresenter_Factory(gameCenterPresenterMembersInjector);
  }
}
