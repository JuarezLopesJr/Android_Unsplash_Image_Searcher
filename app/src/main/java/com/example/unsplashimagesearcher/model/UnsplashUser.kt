package com.example.unsplashimagesearcher.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashUser(
    val name: String,
    val username: String
) : Parcelable {
    val attributionUrl
        get() = "https://unsplash.com/$username?utm_source=ImageSearcher&utm_medium=referral"
}
