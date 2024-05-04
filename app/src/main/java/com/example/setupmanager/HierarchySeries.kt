package com.example.setupmanager

class HierarchySeries(name: String, _parent: HierarchyGame) {
    public val gameName: String = name
    public val parent: HierarchyGame = _parent
    public var sons = ArrayList<HierarchyVehicles>()

}