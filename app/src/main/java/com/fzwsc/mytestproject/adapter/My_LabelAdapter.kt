package com.fzwsc.mytestproject.adapter

import android.content.Context
import android.content.Intent
import android.widget.TextView
import com.fzwsc.mytestproject.*
import com.fzwsc.mytestproject.base.BaseRecyclerAdapter
import com.zhy.adapter.recyclerview.base.ViewHolder

/**
 * Created by Administrator on 2018/01/10 0010.
 */

class My_LabelAdapter(private var context:Context): BaseRecyclerAdapter<String>(context, R.layout.my_text,ArrayList<String>()) {

    //lateinit var listAdapter:My_LabelAdapter

    override fun convert(holder: ViewHolder, s: String, position: Int) {

        holder.getView<TextView>(R.id.txt_label).text = s
        holder.itemView.setOnClickListener {
            when(s){
                "kotlin学习 1" -> {
                    val intent = Intent(mContext,kotlin1Activity::class.java)
                    mContext.startActivity(intent)
                }
                "kotlin学习 2" -> {

                }
                "rxjava学习 3" -> {
                    val intent = Intent(mContext,RxJavaActivity::class.java)
                    mContext.startActivity(intent)
                }
                "ango ui 學習" -> {
                    val intent = Intent(mContext,AnkoActivity::class.java)
                    mContext.startActivity(intent)
                }
                "沉浸式状态栏" ->{
                    val intent = Intent(mContext, cjsActivity::class.java)
                    mContext.startActivity(intent)
                }
            }
        }
    }

    private fun isMax(num:Int = 999):Boolean{
        println("$num 数值")
        return false
    }

}
