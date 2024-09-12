package com.mozhimen.stackk.test

import android.view.View
import com.mozhimen.kotlin.utilk.android.content.startContext
import com.mozhimen.mvvmk.bases.activity.databinding.BaseActivityVDB
import com.mozhimen.stackk.test.databinding.ActivityMainBinding

class MainActivity : BaseActivityVDB<ActivityMainBinding>() {

    fun goStackK(view: View) {
        startContext<StackKActivity>()
    }
}