package com.androiddevs.runningappyt.di.viewmodels

import androidx.lifecycle.ViewModel
import com.androiddevs.runningappyt.di.ViewModelKey
import com.androiddevs.runningappyt.ui.viewmodels.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}