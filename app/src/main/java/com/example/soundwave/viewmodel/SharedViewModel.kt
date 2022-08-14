package com.example.soundwave.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val _title: MutableLiveData<String> = MutableLiveData("Listening for music")
    val title: LiveData<String> = _title
    private val _isTitleShrink: MutableLiveData<Boolean> = MutableLiveData()
    val isTitleShrink: LiveData<Boolean> = _isTitleShrink

    fun setTitle(text: String) {
        _title.value = text
    }

    fun setTitleShrink(isShrink: Boolean) {
        _isTitleShrink.value = isShrink
    }
}