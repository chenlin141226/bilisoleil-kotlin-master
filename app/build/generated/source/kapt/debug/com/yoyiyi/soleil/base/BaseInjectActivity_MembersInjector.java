package com.yoyiyi.soleil.base;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseInjectActivity_MembersInjector<T extends BaseContract.BasePresenter<?>>
    implements MembersInjector<BaseInjectActivity<T>> {
  private final Provider<T> mPresenterProvider;

  public BaseInjectActivity_MembersInjector(Provider<T> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T extends BaseContract.BasePresenter<?>>
      MembersInjector<BaseInjectActivity<T>> create(Provider<T> mPresenterProvider) {
    return new BaseInjectActivity_MembersInjector<T>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseInjectActivity<T> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }
}
