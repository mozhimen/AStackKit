package com.mozhimen.stackk.test

import com.mozhimen.kotlin.lintk.optins.OApiInit_InApplication
import com.mozhimen.kotlin.lintk.optins.OApiMultiDex_InApplication
import com.mozhimen.stackk.bases.BaseApplication
import com.mozhimen.stackk.process.StackKProcess

/**
 * @ClassName MainApplication
 * @Description TODO
 * @Author mozhimen
 * @Date 2024/9/11
 * @Version 1.0
 */
@OptIn(OApiMultiDex_InApplication::class)
class MainApplication : BaseApplication() {
    @OptIn(OApiInit_InApplication::class)
    override fun onCreate() {
        super.onCreate()

        StackKProcess.instance.init()
    }
}