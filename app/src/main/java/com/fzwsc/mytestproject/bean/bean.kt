package com.fzwsc.mytestproject.bean

/**
 * Created by Administrator on 2018/01/10 0010.
 */

class testBean(var num:Int = 999,var str:String=""){

    operator fun component1(): Any {
        return num
    }

    operator fun component2(): Any {
        return str
    }

}