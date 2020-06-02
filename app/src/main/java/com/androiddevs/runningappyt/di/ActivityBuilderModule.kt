package com.androiddevs.runningappyt.di

import com.androiddevs.runningappyt.ui.MainActivity
import com.androiddevs.runningappyt.di.viewmodels.MainViewModelModule
import com.androiddevs.runningappyt.di.viewmodels.StatisticsViewModelModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [MainViewModelModule::class, StatisticsViewModelModule::class])
    abstract fun contributeMainActivity(): MainActivity
}