package com.yoyiyi.soleil.base;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseRefreshFragment_MembersInjector<T extends BaseContract.BasePresenter<?>, K>
    implements MembersInjector<BaseRefreshFragment<T, K>> {
  private final Provider<T> mPresenterProvider;

  public BaseRefreshFragment_MembersInjector(Provider<T> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T extends BaseContract.BasePresenter<?>, K>
      MembersInjector<BaseRefreshFragment<T, K>> create(Provider<T> mPresenterProvider) {
    return new BaseRefreshFragment_MembersInjector<T, K>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseRefreshFragment<T, K> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
