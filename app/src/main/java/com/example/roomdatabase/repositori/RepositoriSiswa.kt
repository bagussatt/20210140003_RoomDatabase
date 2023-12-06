package com.example.roomdatabase.repositori

import com.example.roomdatabase.Data.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswa(): Flow<List<Siswa>>
}