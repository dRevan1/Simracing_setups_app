package com.example.setupmanager

import android.app.Application
import com.example.setupmanager.data.AppContainer
import com.example.setupmanager.data.AppDataContainer

class SetupManagerApp: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}