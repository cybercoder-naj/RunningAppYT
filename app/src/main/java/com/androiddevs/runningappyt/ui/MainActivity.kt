package com.androiddevs.runningappyt.ui

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.androiddevs.runningappyt.R
import com.androiddevs.runningappyt.di.ViewModelProviderFactory
import com.androiddevs.runningappyt.ui.viewmodels.MainViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var testString: String

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this, viewModelProviderFactory).get(MainViewModel::class.java)
        Toast.makeText(this, testString, Toast.LENGTH_SHORT).show()
    }
}
