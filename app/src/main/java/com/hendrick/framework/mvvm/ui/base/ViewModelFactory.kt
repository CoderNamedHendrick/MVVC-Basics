package com.hendrick.framework.mvvm.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hendrick.framework.mvvm.data.api.ApiHelper
import com.hendrick.framework.mvvm.data.repository.MainRepository
import com.hendrick.framework.mvvm.ui.main.viewmodel.MainViewModel
import kotlin.IllegalArgumentException

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}