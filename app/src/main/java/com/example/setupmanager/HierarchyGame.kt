package com.example.setupmanager

class HierarchyGame(name: String, _parent: Hierarchy) {

    public val gameName: String = name
    public val parent: Hierarchy = _parent
    public var sons = ArrayList<HierarchySeries>()


    fun insertSons(lines:List<String>) {
        val sonsList = ArrayList<HierarchySeries>()
        for (s in lines) {
            sonsList.add(HierarchySeries(s,this))
        }
        sons = sonsList
    }
}