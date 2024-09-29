package com.mozhimen.stackk.test

import android.view.View
import com.mozhimen.bindk.bases.activity.databinding.BaseActivityVDB
import com.mozhimen.kotlin.utilk.android.content.startContext
import com.mozhimen.stackk.test.databinding.ActivityStackkBinding

class StackKActivity : BaseActivityVDB<ActivityStackkBinding>() {

    fun goStackKCb(view: View) {
        startContext<StackKCbActivity>()
    }

    fun goStackKProcess(view: View) {
        startContext<StackKProcessActivity>()
    }
}