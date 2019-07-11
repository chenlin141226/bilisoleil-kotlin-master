package com.yoyiyi.soleil.base;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseInjectFragment_MembersInjector<T extends BaseContract.BasePresenter<?>>
    implements MembersInjector<BaseInjectFragment<T>> {
  private final Provider<T> mPresenterProvider;

  public BaseInjectFragment_MembersInjector(Provider<T> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T extends BaseContract.BasePresenter<?>>
      MembersInjector<BaseInjectFragment<T>> create(Provider<T> mPresenterProvider) {
    return new BaseInjectFragment_MembersInjector<T>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseInjectFragment<T> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }
}
