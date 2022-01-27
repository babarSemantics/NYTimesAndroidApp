package com.babar.nytimes.presentation.di

import com.babar.nytimes.data.repository.NewsRepositoryImpl
import com.babar.nytimes.data.repository.dataSource.NewsLocalDataSource
import com.babar.nytimes.data.repository.dataSource.NewsRemoteDataSource
import com.babar.nytimes.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }

}














