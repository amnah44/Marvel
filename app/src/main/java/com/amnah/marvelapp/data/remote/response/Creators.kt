package com.amnah.marvelapp.data.remote.response


import com.amnah.marvelapp.data.remote.response.Item
import com.google.gson.annotations.SerializedName

data class Creators(
    @SerializedName("available")
    val available: Int?,
    @SerializedName("collectionURI")
    val collectionURI: String?,
    @SerializedName("items")
    val items: List<Item>?,
    @SerializedName("returned")
    val returned: Int?
)