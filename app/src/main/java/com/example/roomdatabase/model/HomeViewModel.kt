package com.example.roomdatabase.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomdatabase.Data.Siswa
import com.example.roomdatabase.repositori.RepositoriSiswa
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel(){

    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }

    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )

    val homeUiState: StateFlow<HomeUiState> = repositoriSiswa.getAllSiswaStream().filterNotNull().map { HomeUiState(listSiswa = it.toList()) }.stateIn(scope = viewModelScope, started = SharingStarted.WhileSubscribed(
        TIMEOUT_MILLIS), initialValue = HomeUiState())
}