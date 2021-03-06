package com.hendrick.framework.mvvm.data.repository

import com.hendrick.framework.mvvm.data.api.ApiHelper
import com.hendrick.framework.mvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>>{
        return apiHelper.getUsers()
    }
}