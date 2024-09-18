package com.example.sadhana

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class DashboardResponse(
    val entities: List<Entity>,
    val entityTotal: Int
)


@Parcelize
data class Entity(
    val species: String?,
    val scientificName: String?,
    val habitat: String?,
    val diet: String?,
    val conservationStatus: String?,
    val description: String?,
    val averageLifespan: String?
) : Parcelable

