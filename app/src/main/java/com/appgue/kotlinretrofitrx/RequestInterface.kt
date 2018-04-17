package com.appgue.kotlinretrofitrx

import com.appgue.kotlinretrofitrx.Android
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by Andri on 4/17/2018.
 */
interface RequestInterface {

    @GET("api/android")
    fun getData() : Observable<List<Android>>
}