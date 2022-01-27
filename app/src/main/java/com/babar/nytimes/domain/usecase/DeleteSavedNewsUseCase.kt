package com.babar.nytimes.domain.usecase

import com.babar.nytimes.data.model.Article
import com.babar.nytimes.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}