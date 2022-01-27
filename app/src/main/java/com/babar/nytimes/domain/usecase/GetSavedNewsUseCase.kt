package com.babar.nytimes.domain.usecase

import com.babar.nytimes.data.model.Article
import com.babar.nytimes.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}