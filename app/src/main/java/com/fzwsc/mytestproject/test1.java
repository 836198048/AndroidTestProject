package com.fzwsc.mytestproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.fzwsc.mytestproject.bean.Delivery_CategoryBean;

/**
 * 创建日期：2018/01/30 0030 10:10
 *
 * @author fanxi
 * @version 1.0
 *          文件名称：
 *          类说明：
 */

public class test1 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Delivery_CategoryBean bean = new Delivery_CategoryBean();
        //bean.clone()
    }
}
