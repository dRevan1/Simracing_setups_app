package com.example.setupmanager.data

import android.content.Context

interface AppContainer {
    val setupsDatabaseRepository: SetupsDatabaseRepository
}

class AppDataContainer(private val context: Context) : AppContainer {
    override val setupsDatabaseRepository: SetupsDatabaseRepository by lazy {
        OfflineSetupsRepository(SetupsDatabase.getDatabase(context).tablesDao())
    }
}