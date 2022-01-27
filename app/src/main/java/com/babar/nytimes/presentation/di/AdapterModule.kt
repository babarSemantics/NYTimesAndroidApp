package com.babar.nytimes.presentation.di

import com.babar.nytimes.presentation.adapter.NewsAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {
   @Singleton
   @Provides
   fun provideNewsAdapter():NewsAdapter{
       return NewsAdapter()
   }
}