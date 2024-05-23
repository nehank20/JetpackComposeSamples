package com.example.nehank.composesamples

import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    var _data : MutableStateFlow<String> = MutableStateFlow("")
    val data = _data.asStateFlow()

    fun setData(value: String) {
        _data.value = value
    }

}