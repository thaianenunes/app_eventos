package com.example.appeventos.domain.di

import com.example.appeventos.data.repository.Repository
import com.example.appeventos.data.repository.RepositoryImpl
import com.example.appeventos.data.service.NetworkService
import com.example.appeventos.presentation.eventslist.EventsListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

    single {
        RepositoryImpl(NetworkService.initRetrofit())
    }
}