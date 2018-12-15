package com.lightworld.unusualweatherandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_feedback.*
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response



class FeedbackActivity : AppCompatActivity() {
    val client = OkHttpClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        initView()
    }

    private fun initView() {
        materialButton.setOnClickListener {
            var content = editText.text.toString().trim()

            Observable.create<Response> {
                val body = FormBody.Builder()
                    .add("content", content)
                    .add("receiverEmail", "vipheyue@foxmail.com")
                    .add("subject", "异常天气客户端反馈")
                    .build()

                val request = Request.Builder()
                    .url("http://s.welightworld.com/mail/sendMailApi")
//                    .url("http://goodgoods.vaiwan.com/mail/sendMailApi")
                    .post(body)
                    .build()

                val response = client.newCall(request).execute()

                it.onNext(response)
            }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<Response> {
                    override fun onComplete() {

                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(response: Response) {
                        var result = response.body()!!.string()
                        Toast.makeText(this@FeedbackActivity,result,Toast.LENGTH_SHORT).show()
                        finish()

                    }

                    override fun onError(e: Throwable) {
                        Toast.makeText(this@FeedbackActivity,e.message,Toast.LENGTH_SHORT).show()
                        e.printStackTrace()
                    }
                })

        }

    }
}
