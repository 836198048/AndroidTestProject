package com.fzwsc.mytestproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fzwsc.mytestproject.bean.testBean
import kotlinx.android.synthetic.main.kotlin1.*


/**
 * Created by Administrator on 2018/01/10 0010.
 */

class kotlin1Activity : AppCompatActivity() {

    //b允许为空
    var b: String? = "abc"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin1)
        txt_label.text = "1"
        /*数组 循环*/
        var list = arrayListOf<testBean>();
        list.add(testBean())
        list.add(testBean())
        list.add(testBean())
        list.add(testBean())

        //可空类型
        val nullableList: List<Int?> = listOf(1, 2, null, 4)

        /*解构*/
        val (num, str) = testBean()
        println("结构 -> $num -> $str")

        val map= mapOf<String ,String>(Pair("PVG","浦东"),Pair("SHA","虹桥"),Pair("HGH","萧山"))
        /*遍历map*/
        for ((key, value) in map) {
            println("$key -> $value")
            // 使用该 key、value 做些事情
        }

        var positives = list.filter { it.num > 2 }
        positives.forEach {
            var num = it.num
            println("$num 得分")
        }




    }

    fun testApply() {
        // fun <T> T.apply(f: T.() -> Unit): T { f(); return this }
        //首先let()的定义是这样的，默认当前这个对象作为闭包的it参数，返回值是函数里面最后一行，或者指定return
        //apply函数是这样的，调用某对象的apply函数，在函数范围内，可以任意调用该对象的任意方法，并返回该对象
        //with函数是一个单独的函数，并不是Kotlin中的extension，所以调用方式有点不一样，返回是最后一行，然后可以直接调用对象的方法，感觉像是let和apply的结合。
        ArrayList<String>().apply {
            add("testApply")
            add("testApply")
            add("testApply")
            println("this = " + this)
        }.let { println(it) }

        with(ArrayList<String>()) {
            add("testWith")
            add("testWith")
            add("testWith")
            println("this = " + this)
        }.let { println(it) }

    }

}
