package com.example.wordofmouthapp.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Qualification(
    @Json(name = "qualification") val qualification: String,
    @Json(name = "description") val description: String,
    @Json(name = "categoryRestrictions") val categoryRestrictions: List<String> = emptyList(),
)
