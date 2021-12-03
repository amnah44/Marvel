package com.amnah.marvelapp.data.remote.response.comics


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("extension")
    val extension: String?,
    @SerializedName("path")
    val path: String?
)