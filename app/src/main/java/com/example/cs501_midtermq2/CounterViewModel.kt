package com.example.cs501_midtermq2

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var count = mutableStateOf(0)
        private set

    fun increment() {
        count.value++
    }
}