package com.example.roomdatabase.model

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomdatabase.AplikasiSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(AplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(AplikasiSiswa().container.repositoriSiswa)
        }
    }
}

fun CreationExtras.aplikasiSiswa():AplikasiSiswa = (this)[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa