package com.example.unsplashimagesearcher.model

import com.example.unsplashimagesearcher.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {

}