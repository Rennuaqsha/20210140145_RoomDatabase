package com.example.praktikum10

import android.app.Application
import com.example.praktikum10.repository.ContainerApp
import com.example.praktikum10.repository.ContainerDataApp

class AplikasiSiswa: Application() {
    /*
    AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }


}