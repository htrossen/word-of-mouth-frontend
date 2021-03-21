package com.example.wordofmouthapp.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Review(
    @Json(name = "id") val id: String,
    @Json(name = "companyId") val companyId: String,
    @Json(name = "rating") val rating: Int,
    @Json(name = "wouldRecommend") val wouldRecommend: Boolean? = null,
    @Json(name = "description") val description: String? = null,
    @Json(name = "helpful") val helpful: Int = 0,
    @Json(name = "notHelpful") val notHelpful: Int = 0,
    @Json(name = "reported") val reported: Int = 0,
)
