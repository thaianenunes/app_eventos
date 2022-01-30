package com.example.appeventos.data.repository

import android.util.Log
import com.example.appeventos.data.model.EventsDTO
import com.example.appeventos.data.service.EventService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RepositoryImpl(private var service: EventService) : Repository {

    override suspend fun getEvents(): List<EventsDTO> =
        withContext(Dispatchers.IO) {
            try {
                service.getEvents()
            } catch (error: Exception) {
                throw error
            }
        }
}