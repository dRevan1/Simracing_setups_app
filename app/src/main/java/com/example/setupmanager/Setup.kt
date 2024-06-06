package com.example.setupmanager

import android.health.connect.datatypes.units.Power

class Setup(setupName: String) {
    var name: String = setupName
    var powertrain: Powertrain = Powertrain()
    var wheelsBrakes: WheelsBrakes = WheelsBrakes()
    var suspensionAero: SuspensionAero = SuspensionAero()
    var dampers: Dampers = Dampers()
    var chassis: Chassis = Chassis()
}