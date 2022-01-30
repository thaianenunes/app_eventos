package com.example.appeventos.data.model

data class EventsDTO(
    val id: String,
    val title: String,
    val image: String,
    val date: Int,
    val description: String,
    val price: Double,
    val longitude: Double,
    val latitude: Double,
    val people: List<PeopleDTO>
)
