package com.example.appeventos.data.repository

interface Repository {
    suspend fun getEvents(): List<EventsDTO>
}