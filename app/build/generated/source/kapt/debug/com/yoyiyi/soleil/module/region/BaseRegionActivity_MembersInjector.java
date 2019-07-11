package com.yoyiyi.soleil.module.region;

import com.yoyiyi.soleil.base.BaseContract;
import com.yoyiyi.soleil.base.BaseInjectActivity;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseRegionActivity_MembersInjector<T extends BaseContract.BasePresenter<?>, K>
    implements MembersInjector<BaseRegionActivity<T, K>> {
  private final Provider<T> mPresenterProvider;

  public BaseRegionActivity_MembersInjector(Provider<T> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T extends BaseContract.BasePresenter<?>, K>
      MembersInjector<BaseRegionActivity<T, K>> create(Provider<T> mPresenterProvider) {
    return new BaseRegionActivity_MembersInjector<T, K>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseRegionActivity<T, K> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
