package com.example.ploichao.callapi
import com.example.msi_gl62.karn.network.BaseRetrofit
import com.example.msi_gl62.karn.network.BaseUrl
import com.example.ploichao.InterActor
import com.example.ploichao.model.LiatCategory
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.Response

class Request : InterActor.ActData {

    interface ResponseListCategory {
        fun <T> onSuccess(t: T)
    }

    override fun callLisCategorytApi(callback: ResponseListCategory) {
        val baseService by lazy { BaseRetrofit.createRx(BaseUrl.baseUrl) }
        baseService?.Category()?.subscribeOn(Schedulers.io())?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe(object : DisposableObserver<Response<LiatCategory>>() {
                override fun onComplete() {}
                override fun onNext(t: Response<LiatCategory>) {
                    t.body()?.let { callback.onSuccess(it) }
                }
                override fun onError(e: Throwable) {}
            })
    }


}