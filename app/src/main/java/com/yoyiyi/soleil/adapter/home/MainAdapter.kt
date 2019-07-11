package com.yoyiyi.soleil.adapter.home

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.yoyiyi.soleil.R
import com.yoyiyi.soleil.module.home.*
import com.yoyiyi.soleil.utils.AppUtils

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 *
 * @date 创建时间：2017/5/23 18:25
 * 描述:主页Tag
 */

class MainAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val mTitle = AppUtils.getStringArray(R.array.main_title)
    // 直接指定长度，返回一个长度指定、所有值都是 null 的数组。
    private val mFragment = arrayOfNulls<Fragment>(mTitle.size)

    override fun getItem(position: Int): Fragment? {
        if (mFragment[position] == null) {
            when (position) {
                0 ->
                    //直播
                    mFragment[position] = LiveFragment.newInstance()
                1 ->
                    //推荐
                    mFragment[position] = RecommendFragment.newInstance()
                2 ->
                    //追番
                    mFragment[position] = ChaseBangumiFragment.newInstance()
                3 ->
                    //分区
                    mFragment[position] = RegionFragment.newInstance()
                4 ->
                    //动态
                    mFragment[position] = DynamicFragment.newInstance()
                5 ->
                    //发现
                    mFragment[position] = DiscoverFragment.newInstance()
            }
        }
        return mFragment[position]
    }

    override fun getCount(): Int = mTitle.size


    override fun getPageTitle(position: Int): CharSequence = mTitle[position]

}
