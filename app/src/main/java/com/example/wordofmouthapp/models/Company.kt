package com.example.wordofmouthapp.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Company(
    @Json(name = "id") val id: String,
    @Json(name = "name") val name: String,
    @Json(name = "category") val category: String,
    @Json(name = "imageUrl") val imageUrl: String,
    @Json(name = "companyUrl") val companyUrl: String? = null,
    @Json(name = "address") val address: String? = null,
    @Json(name = "city") val city: String? = null,
    @Json(name = "state") val state: String? = null,
    @Json(name = "zipcode") val zipcode: String? = null,
    @Json(name = "qualifications") val qualifications: List<Qualification> = emptyList(),
    @Json(name = "rating") val rating: Double? = null,
    @Json(name = "reviews") val reviews: List<Review> = emptyList(),
)
