package com.example.mvvm_crud_operation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

import com.example.mvvm_crud_operation.models.NicePlace

class MainViewModel: ViewModel() {
    var lst = MutableLiveData<ArrayList<NicePlace>>()
    var newlist = arrayListOf<NicePlace>()

    fun add(blog: NicePlace){
        newlist.add(blog)
        lst.value=newlist
    }

    fun remove(blog: NicePlace){
        newlist.remove(blog)
        lst.value=newlist
    }
    fun edit(blog: NicePlace){
        newlist.remove(blog)
        lst.value=newlist
    }

}