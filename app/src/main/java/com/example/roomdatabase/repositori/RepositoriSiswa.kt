package com.example.roomdatabase.repositori

import com.example.roomdatabase.Data.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswa(): Flow<List<Siswa>>

    fun getSiswa(id: Int): Flow<Siswa>

    suspend fun insertSiswa(siswa: Siswa)

    suspend fun deleteSiswa(siswa: Siswa)

    suspend fun updateSiswa(siswa: Siswa)
}