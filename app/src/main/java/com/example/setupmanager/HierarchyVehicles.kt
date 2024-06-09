package com.example.setupmanager

class HierarchyVehicles(name: String, _parent: HierarchySeries) {
    val vehicleName: String = name
    val parent: HierarchySeries = _parent
    var setupList = mutableListOf<Setup>()
}