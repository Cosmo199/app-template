package com.example.ploichao
import com.example.ploichao.callapi.Request
import com.example.ploichao.model.LiatCategory

class MainPresenter(val view: MainActivity) : MainContact.Presenter, Request.ResponseListCategory {

    private val actData: InterActor.ActData = Request()

    override fun callListFoodApi(key: String?) {
        actData.callLisCategorytApi(this)
    }

    override fun <T> onSuccess(t: T) {
        view.onCallSuccess(categoryData = (t as LiatCategory).results)
    }
}