package com.example.roomdatabase.Data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertSiswa(siswa: Siswa)
}