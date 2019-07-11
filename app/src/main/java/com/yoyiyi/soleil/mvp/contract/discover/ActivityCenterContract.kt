package com.yoyiyi.soleil.mvp.contract.discover

import com.yoyiyi.soleil.base.BaseContract
import com.yoyiyi.soleil.bean.discover.ActivityCenter

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * *
 * @date 创建时间：2017/5/12 10:09
 * * 描述:话题中心Contract
 */

interface ActivityCenterContract {

    interface View : BaseContract.BaseView {

        fun showActivityCenter(listBeanList: List<ActivityCenter.ListBean>, total: Int)
    }

    interface Presenter<in T> : BaseContract.BasePresenter<T> {

        fun getActivityCenterData(page: Int, pageSize: Int)
    }
}
