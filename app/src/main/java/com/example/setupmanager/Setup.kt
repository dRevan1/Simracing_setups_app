package com.example.setupmanager

import android.content.Context
import android.health.connect.datatypes.units.Power

class Setup(setupName: String, context: Context) {
    var name: String = setupName
    var id: Int = 0
    var powertrain: Powertrain = Powertrain(context)
    var wheelsBrakes: WheelsBrakes = WheelsBrakes(context)
    var suspensionAero: SuspensionAero = SuspensionAero(context)
    var dampers: Dampers = Dampers(context)
    var chassis: Chassis = Chassis(context)
}