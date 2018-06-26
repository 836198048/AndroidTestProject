package com.fzwsc.mytestproject

import android.graphics.Bitmap
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers


/**
 * Created by Administrator on 2018/01/10 0010.
 */

class RxJavaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rxjava)

//        subscribeOn()改变调用它之前代码的线程
//                observeOn()改变调用它之后代码的线程

        var sub = Observable.create(ObservableOnSubscribe<Double> { e ->
            var value = 0.1
            println("时间1 " + System.currentTimeMillis())
            for (i in 0..29999999) {
                for (j in 0..10) {
                    value *= 2
                    //value = value / 0.1;
                }
            }
            e.onNext(value)
        }).subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())

        sub.subscribe(Consumer {
            f -> print(f)
        })
        sub .subscribe(object : Observer<Double> {
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

//        private var subscription: Disposable? = null
//        subscription = Observable.unsafeCreate<Map<String, String>> { subscriber ->
//            val result = PayTask(mContext).payV2(sign,true)
//            subscriber.onNext(result)
//        }.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread())
//                .unsubscribeOn(AndroidSchedulers.mainThread()).subscribe {map ->
//                    val result = PayResult(map)
//                    when(result.resultStatus){
//                        "9000" -> {
//                            //付款完成
//                            //发送支付成功事件
//                            ToastView.showToastShort("支付成功")
//                            Apollo.emit(EventTag.PaySuccessEvent,paySn)
//                        }
//                        else -> {
//                            //待付款
//                            mContext.toast(result.memo)
//                        }
//                    }
//                    onComplete?.invoke()
//                }

    }
}