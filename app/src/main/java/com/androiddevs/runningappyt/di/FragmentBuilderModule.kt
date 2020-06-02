package com.androiddevs.runningappyt.di

import com.androiddevs.runningappyt.ui.MainActivity
import com.androiddevs.runningappyt.di.viewmodels.MainViewModelModule
import com.androiddevs.runningappyt.di.viewmodels.StatisticsViewModelModule
import com.androiddevs.runningappyt.ui.fragments.*
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeRunFragment(): RunFragment

    @ContributesAndroidInjector
    abstract fun contributeStatisticsFragment(): StatisticsFragment

    @ContributesAndroidInjector
    abstract fun contributeSettingsFragment(): SettingsFragment

    @ContributesAndroidInjector
    abstract fun contributeSetupFragment(): SetupFragment

    @ContributesAndroidInjector
    abstract fun contributeTrackingFragment(): TrackingFragment
}