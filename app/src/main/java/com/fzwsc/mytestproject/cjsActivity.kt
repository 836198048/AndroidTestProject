package com.fzwsc.mytestproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jaeger.library.StatusBarUtil
import kotlinx.android.synthetic.main.cjs.*

@SuppressLint("Registered")
/**
 * Created by Administrator on 2018/01/10 0010.
 */

class cjsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cjs)

        StatusBarUtil.setTranslucentForImageView(this,0,head)
//        verticalLayout {
//
//            imageView(R.drawable.abc_vector_test){
//
//            }
//        }

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