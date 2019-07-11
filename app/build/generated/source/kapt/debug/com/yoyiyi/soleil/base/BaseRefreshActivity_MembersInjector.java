package com.yoyiyi.soleil.base;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseRefreshActivity_MembersInjector<T extends BaseContract.BasePresenter<?>, K>
    implements MembersInjector<BaseRefreshActivity<T, K>> {
  private final Provider<T> mPresenterProvider;

  public BaseRefreshActivity_MembersInjector(Provider<T> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T extends BaseContract.BasePresenter<?>, K>
      MembersInjector<BaseRefreshActivity<T, K>> create(Provider<T> mPresenterProvider) {
    return new BaseRefreshActivity_MembersInjector<T, K>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseRefreshActivity<T, K> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
