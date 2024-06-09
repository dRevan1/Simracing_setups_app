package com.example.setupmanager

import android.content.Context
import com.example.setupmanager.data.Setups
import com.example.setupmanager.data.SetupsDatabase

class HierarchyVehicles(name: String, _parent: HierarchySeries) {
    val vehicleName: String = name
    val parent: HierarchySeries = _parent
    var setupList = mutableListOf<Setups>()
}