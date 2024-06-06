package com.example.setupmanager

import android.content.Context

class WheelsBrakes(context: Context) {
    var compounds:HashMap<String, String> = hashMapOf(
        context.resources.getString(R.string.compound_front) to "Slick",
        context.resources.getString(R.string.compound_rear) to "Slick",
    )

    var otherSettings:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.tire_pressure_front) to 0.0,
        context.resources.getString(R.string.tire_pressure_rear) to 0.0,
        context.resources.getString(R.string.camber_front) to 0.0,
        context.resources.getString(R.string.camber_rear) to 0.0,
        context.resources.getString(R.string.brake_disc_front) to 2.0,
        context.resources.getString(R.string.brake_disc_rear) to 2.0,
        context.resources.getString(R.string.brake_bias_front) to 0.0,
        context.resources.getString(R.string.brake_bias_rear) to 0.0,
        context.resources.getString(R.string.front_brake_duct) to 1.0,
        context.resources.getString(R.string.rear_brake_duct) to 1.0,
        context.resources.getString(R.string.max_pedal_force) to 90.0,
        context.resources.getString(R.string.handbrake_pressure) to 0.0
    )
}