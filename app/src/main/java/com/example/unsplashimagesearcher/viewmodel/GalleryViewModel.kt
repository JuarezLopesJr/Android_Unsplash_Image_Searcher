package com.example.unsplashimagesearcher.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.unsplashimagesearcher.model.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {

}