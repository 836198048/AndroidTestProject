package com.fzwsc.mytestproject

import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import java.sql.DriverManager.println

/**
 * Created by Administrator on 2018/01/11 0011.
 */

class test {

    internal fun testA() {
        Observable.create(ObservableOnSubscribe<Double> { e ->
            var value = 0.1
            println("时间1 " + System.currentTimeMillis())
            for (i in 0..29999999) {
                for (j in 0..99) {
                    value = value * 2
                    //value = value / 0.1;
                }
            }
            println("onNext" + System.currentTimeMillis())
            e.onNext(value)
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(object :Observer<Double>{
                    override fun onSubscribe(d: Disposable) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onError(e: Throwable) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onComplete() {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onNext(t: Double) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                })

    }

}
