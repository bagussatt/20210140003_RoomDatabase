package com.example.roomdatabase

import android.app.Application
import com.example.roomdatabase.repositori.ContainerApp
import com.example.roomdatabase.repositori.ContainerDataApp


class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}