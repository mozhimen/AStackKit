package com.mozhimen.stackk.test

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import com.mozhimen.kotlin.utilk.android.util.UtilKLogWrapper
import com.mozhimen.mvvmk.bases.activity.databinding.BaseActivityVDB
import com.mozhimen.kotlin.lintk.optins.OApiInit_InApplication
import com.mozhimen.stackk.callback.StackKCb
import com.mozhimen.kotlin.utilk.android.widget.showToast
import com.mozhimen.stackk.basic.commons.IStackKListener
import com.mozhimen.stackk.test.databinding.ActivityStackkCbBinding

class StackKCbActivity : BaseActivityVDB<ActivityStackkCbBinding>(), IStackKListener {

    @OptIn(OApiInit_InApplication::class)
    @SuppressLint("SetTextI18n")
    override fun initView(savedInstanceState: Bundle?) {
        val stackTopActivity = StackKCb.instance.getStackTopActivity()
        val stackCount = StackKCb.instance.getStackCount()
        vdb.stackkCbTitle.text = "StackTop: ${stackTopActivity?.javaClass?.simpleName ?: "Null"}, StackCount: $stackCount"

        StackKCb.instance.addFrontBackListener(this)
    }

    @OptIn(OApiInit_InApplication::class)
    override fun onDestroy() {
        StackKCb.instance.removeFrontBackListener(this)
        super.onDestroy()
    }

    override fun onChanged(isFront: Boolean, activity: Activity) {
        "App is At Front ?: $isFront".showToast()
        UtilKLogWrapper.d(TAG, "App is At Front ?: $isFront")
    }
}