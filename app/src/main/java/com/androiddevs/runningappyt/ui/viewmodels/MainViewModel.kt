package com.androiddevs.runningappyt.ui.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(var testString: String): ViewModel() {

    init {
        Log.d("ViewModel", testString)
    }
}