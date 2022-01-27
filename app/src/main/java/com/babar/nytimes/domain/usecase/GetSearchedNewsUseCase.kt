package com.babar.nytimes.domain.usecase

import com.babar.nytimes.data.model.APIResponse
import com.babar.nytimes.data.util.Resource
import com.babar.nytimes.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
     suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse>{
         return newsRepository.getSearchedNews(country,searchQuery,page)
     }
}