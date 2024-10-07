package com.mozhimen.stackk.process

import com.mozhimen.kotlin.lintk.optins.OApiInit_InApplication
import com.mozhimen.kotlin.lintk.optins.OApiUse_BaseApplication
import com.mozhimen.stackk.basic.commons.IStackK
import com.mozhimen.stackk.process.helpers.StackKProcessDelegate

/**
 * @ClassName StackKProcess
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/6/11 14:32
 * @Version 1.0
 */
@OApiUse_BaseApplication
@OApiInit_InApplication
class StackKProcess private constructor() : IStackK by StackKProcessDelegate() {
    companion object {
        @JvmStatic
        val instance = INSTANCE.holder
    }

    /////////////////////////////////////////////////////////////////////////

    private object INSTANCE {
        val holder = StackKProcess()
    }
}