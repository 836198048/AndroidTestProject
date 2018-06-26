package com.fzwsc.mytestproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.fzwsc.mytestproject.adapter.My_LabelAdapter
import com.jaeger.library.StatusBarUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var listAdapter:My_LabelAdapter
    /*延迟属性*/
    /*lateinit可以在任何位置初始化并且可以初始化多次。而lazy在第一次被调用时就被初始化，想要被改变只能重新定义*/
    private val listAdapter:My_LabelAdapter by lazy {
        My_LabelAdapter(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {



            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //StatusBarUtil.setTransparent(this)
            StatusBarUtil.setColor(this,resources.getColor(R.color.colorPrimary))

            rv_label.layoutManager = LinearLayoutManager(this)
            listAdapter.setDataList(arrayListOf<String>("kotlin学习 1","kotlin学习 2","rxjava学习 3","ango ui 學習","沉浸式状态栏"))
            rv_label.adapter = listAdapter
            listAdapter.notifyDataSetChanged()


           Thread(Runnable {
               val s =""
               val s1 =""
               val s2 =""

           }).start()

    }
}
