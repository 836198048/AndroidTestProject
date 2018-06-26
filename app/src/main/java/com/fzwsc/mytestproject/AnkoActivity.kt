package com.fzwsc.mytestproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

@SuppressLint("Registered")
/**
 * Created by Administrator on 2018/01/10 0010.
 */

class AnkoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.rxjava)
        verticalLayout {
            padding = dip(30)
            val name = editText()
            editText()
            editText()
            editText()
            editText()
            button("Say Hello") {
                onClick { toast("Hello, ${name.text}!") }
            }.lparams(width = wrapContent,height = wrapContent) {
                horizontalMargin = dip(5)
                topMargin = dip(10)
            }
        }

        /*插入xml*/
//        include<View>(R.layout.something) {
//            backgroundColor = Color.RED
//        }.lparams(width = matchParent) { margin = dip(12) }

        /*覆蓋*/
//        linearLayout{
//
//            editText()
//            editText()
//        }

    }
}