package com.example.roomdatabase.Data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Siswa::class], version = 1)
abstract class DatabaseSiswa : RoomDatabase() {
    abstract fun siswaDao(): SiswaDao
}