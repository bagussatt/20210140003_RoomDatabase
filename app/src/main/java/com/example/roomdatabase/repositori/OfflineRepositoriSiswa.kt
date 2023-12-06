package com.example.roomdatabase.repositori

import com.example.roomdatabase.Data.Siswa
import com.example.roomdatabase.Data.SiswaDao
import kotlinx.coroutines.flow.Flow

abstract class OfflineRepositoriSiswa(private val siswaDao: SiswaDao):RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> {
        return siswaDao.getAllSiswa()
    }

    override fun getSiswaStream(id: Int): Flow<Siswa?> {
        return siswaDao.getSiswa(id)
    }

    override suspend fun insertSiswa(siswa: Siswa) {
        return siswaDao.insert(siswa)
    }

    override suspend fun deleteSiswa(siswa: Siswa) {
        return siswaDao.delete(siswa)
    }

    override suspend fun updateSiswa(siswa: Siswa) {
        return siswaDao.update(siswa)
    }
}