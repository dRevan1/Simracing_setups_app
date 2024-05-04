package com.example.setupmanager

class HierarchyGame(name: String, _parent: Hierarchy) {

    public val gameName: String = name
    public val parent: Hierarchy = _parent
    public var sons = ArrayList<HierarchySeries>()


    fun insertSons(sonsList: ArrayList<HierarchySeries>) {
        sons = sonsList
    }
}