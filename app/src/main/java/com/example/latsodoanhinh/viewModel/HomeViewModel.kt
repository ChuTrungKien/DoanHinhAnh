package com.example.latsodoanhinh.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    //1: Du lieu van ban hien thi:
    private val _resultText = MutableLiveData<String>()
    val resultText: LiveData<String> = _resultText //Activity se nhin thay thang cu nay.

    //2: Mo phong trang thai Loading (de an/hien ProgressBar)
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    //logic gỉa lập tải dữ liệu...
    fun simulateDataLoading() {
        viewModelScope.launch {
            try {
                _isLoading.value = true
                _resultText.value = "Đang tải dữ liệu..."

                delay(2000)

                _resultText.value = "Thành công! Dữ liệu đã được trả về."
            } finally {
                _isLoading.value = false
            }
        }
    }
}