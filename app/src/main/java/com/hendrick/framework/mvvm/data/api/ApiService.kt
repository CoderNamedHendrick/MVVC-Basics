package com.hendrick.framework.mvvm.data.api

import com.hendrick.framework.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>
}