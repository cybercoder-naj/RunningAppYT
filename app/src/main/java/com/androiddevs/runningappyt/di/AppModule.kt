package com.androiddevs.runningappyt.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideTestString() = "Dagger is hard"
}