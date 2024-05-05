package com.example.setupmanager

class HierarchySeries(name: String, _parent: HierarchyGame) {
    public val gameName: String = name
    public val parent: HierarchyGame = _parent
    public var sons = ArrayList<HierarchyVehicles>()


    fun insertSons(lines:List<String>) {
        val sonsList = ArrayList<HierarchyVehicles>()
        for (s in lines) {
            sonsList.add(HierarchyVehicles(s,this))
        }
        sons = sonsList
    }

}