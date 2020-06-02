package com.androiddevs.runningappyt.di.viewmodels

import androidx.lifecycle.ViewModel
import com.androiddevs.runningappyt.di.ViewModelKey
import com.androiddevs.runningappyt.ui.viewmodels.MainViewModel
import com.androiddevs.runningappyt.ui.viewmodels.StatisticsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class StatisticsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(StatisticsViewModel::class)
    internal abstract fun bindMainViewModel(viewModel: StatisticsViewModel): ViewModel
}