package com.mozhimen.stackk.basic.commons

import android.app.Activity
import java.lang.ref.WeakReference

/**
 * @ClassName StackKListener
 * @Description TODO
 * @Author mozhimen / Kolin Zhao
 * @Date 2022/4/21 11:50
 * @Version 1.0
 */
interface IStackKListener {
    fun onChanged(isFront: Boolean, activity: Activity)
}