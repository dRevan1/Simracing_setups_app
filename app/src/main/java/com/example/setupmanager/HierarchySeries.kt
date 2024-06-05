package com.example.setupmanager

class HierarchySeries(name: String, _parent: HierarchyGame) {
    val seriesName: String = name
    val parent: HierarchyGame = _parent
    var sons = ArrayList<HierarchyVehicles>()


    fun insertSons(lines:List<String>) {
        var index: Int = parent.parent.index
        val sonsList = ArrayList<HierarchyVehicles>()
        for (s in lines) {
            sonsList.add(HierarchyVehicles(s,this, index))
            index++
        }
        parent.parent.index = index
        sons = sonsList
    }

}