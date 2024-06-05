package com.example.setupmanager

class HierarchyVehicles(name: String, _parent: HierarchySeries, index: Int) {
    val vehicleName: String = name
    val parent: HierarchySeries = _parent
    val id: Int = index
}