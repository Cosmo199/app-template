package com.example.ploichao.network
import com.example.ploichao.model.LiatCategory
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.*

interface BaseService {

    @GET("backend-admin/api/category")
    fun Category(): Observable<Response<LiatCategory>>

}