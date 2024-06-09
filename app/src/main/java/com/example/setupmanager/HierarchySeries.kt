package com.example.setupmanager

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.setupmanager.data.OfflineSetupsRepository
import com.example.setupmanager.data.SetupsDatabase
import com.example.setupmanager.data.SetupsDatabaseRepository
import com.example.setupmanager.data.TablesDao
import com.example.setupmanager.data.Vehicle

class HierarchySeries(name: String, _parent: HierarchyGame) {
    val seriesName: String = name
    val parent: HierarchyGame = _parent
    var sons = ArrayList<HierarchyVehicles>()


    fun insertSons(lines:List<String>, context: Context) {
        //val database: SetupsDatabase = SetupsDatabase.getDatabase(context = context)
        val sonsList = ArrayList<HierarchyVehicles>()
        for (s in lines) {
            sonsList.add(HierarchyVehicles(s,this))
            //database.tablesDao().insert(Vehicle(0, s))
        }
        sons = sonsList
    }

    fun CreationExtras.setupManagerApp(): SetupManagerApp =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as SetupManagerApp)
}