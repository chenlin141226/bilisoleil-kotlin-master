package com.yoyiyi.soleil.module.search;

import com.yoyiyi.soleil.base.BaseContract;
import com.yoyiyi.soleil.base.BaseInjectFragment;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseSearchFragment_MembersInjector<T extends BaseContract.BasePresenter<?>, K>
    implements MembersInjector<BaseSearchFragment<T, K>> {
  private final Provider<T> mPresenterProvider;

  public BaseSearchFragment_MembersInjector(Provider<T> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T extends BaseContract.BasePresenter<?>, K>
      MembersInjector<BaseSearchFragment<T, K>> create(Provider<T> mPresenterProvider) {
    return new BaseSearchFragment_MembersInjector<T, K>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseSearchFragment<T, K> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectFragment) instance).mPresenter = mPresenterProvider.get();
  }
}
