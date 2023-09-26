package com.google.fragmentstest.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel: ViewModel() {

    private val count = MutableLiveData<Int>()

    fun getCount() : LiveData<Int> {
        return count
    }

    init {
        count.value = 0
    }

    fun increment() {
        count.value = count.value!! + 1
    }

    fun decrement() {
        count.value = count.value!! - 1
    }
}

