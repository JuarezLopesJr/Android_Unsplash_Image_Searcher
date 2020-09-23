package com.example.unsplashimagesearcher.api

import com.example.unsplashimagesearcher.model.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)