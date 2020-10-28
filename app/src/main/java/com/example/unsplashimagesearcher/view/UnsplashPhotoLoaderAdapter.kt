package com.example.unsplashimagesearcher.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.unsplashimagesearcher.databinding.UnsplashPhotoStateLoaderFooterBinding

class UnsplashPhotoLoaderAdapter(private val retry: () -> Unit) :
    LoadStateAdapter<UnsplashPhotoLoaderAdapter.LoadStateViewHolder>() {

    override fun onBindViewHolder(holder: LoadStateViewHolder, loadState: LoadState) {
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoadStateViewHolder {
        val binding =
            UnsplashPhotoStateLoaderFooterBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )

        return LoadStateViewHolder(binding)
    }

    inner class LoadStateViewHolder(private val binding: UnsplashPhotoStateLoaderFooterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.footerBtnRetry.setOnClickListener {
                retry.invoke()
            }
        }

        fun bind(loadState: LoadState) {
            binding.apply {
                footerLoader.isVisible = loadState is LoadState.Loading
                footerBtnRetry.isVisible = loadState !is LoadState.Loading
                footerTextViewError.isVisible = loadState !is LoadState.Loading
            }

        }
    }
}