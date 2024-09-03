package com.mozhimen.stackk.callback


import com.mozhimen.kotlin.lintk.optins.OApiInit_InApplication
import com.mozhimen.stackk.callback.helpers.StackKCbDelegate
import com.mozhimen.stackk.basic.commons.IStackK
import com.mozhimen.stackk.callback.commons.IStackKLifecycle
/**
 * @ClassName StackKCb
 * @Description 提供前后台状态监听 以及栈顶activity的服务
 * @Author mozhimen / Kolin Zhao
 * @Date 2021/12/20 21:58
 * @Version 1.0
 */
@OApiInit_InApplication
class StackKCb private constructor(stackKCbDelegate: StackKCbDelegate) : IStackK by stackKCbDelegate, IStackKLifecycle by stackKCbDelegate {
    companion object {
        @JvmStatic
        val instance = INSTANCE.holder
    }

    /////////////////////////////////////////////////////////////////////////

    private object INSTANCE {
        val holder = StackKCb(StackKCbDelegate())
    }
}