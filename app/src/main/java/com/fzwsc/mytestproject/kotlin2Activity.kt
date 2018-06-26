package com.fzwsc.mytestproject

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.kotlin1.*

/**
 * Created by Administrator on 2018/01/10 0010.
 */

class kotlin2Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin1)
        txt_label.text = "1"

        /*数组 循环*/
        var list = intArrayOf(1,2,3,4)
        var positives = list.filter { it -> it > 2 }
        positives.forEach {
            println(it)
        }

    }
}