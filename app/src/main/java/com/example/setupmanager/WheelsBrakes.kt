package com.example.setupmanager

import android.content.Context

class WheelsBrakes(context: Context) {
    var compoundMin: Int = 0
    var compoundMax: Int = 0
    var compounds:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.compound_front) to 0,
        context.resources.getString(R.string.compound_rear) to 0
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

    var otherSettingsMin:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.tire_pressure_text) to 0.0,
        context.resources.getString(R.string.camber_text) to 0.0,
        context.resources.getString(R.string.brake_disc_text) to 2.0,
        context.resources.getString(R.string.front_brake_duct) to 1.0,
        context.resources.getString(R.string.max_pedal_force) to 90.0,
        context.resources.getString(R.string.handbrake_pressure) to 0.0
    )

    var otherSettingsMax:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.tire_pressure_text) to 0.0,
        context.resources.getString(R.string.camber_text) to 0.0,
        context.resources.getString(R.string.brake_disc_text) to 2.0,
        context.resources.getString(R.string.max_brake_bias_front) to 0.0,
        context.resources.getString(R.string.max_brake_bias_rear) to 0.0,
        context.resources.getString(R.string.front_brake_duct) to 1.0,
        context.resources.getString(R.string.max_pedal_force) to 90.0,
        context.resources.getString(R.string.handbrake_pressure) to 0.0
    )

    var otherSettingsStep:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.tire_pressure_text) to 0.0,
        context.resources.getString(R.string.camber_text) to 0.0,
        context.resources.getString(R.string.brake_disc_text) to 2.0,
        context.resources.getString(R.string.brake_bias_text) to 0.0,
        context.resources.getString(R.string.front_brake_duct) to 1.0,
        context.resources.getString(R.string.max_pedal_force) to 90.0,
        context.resources.getString(R.string.handbrake_pressure) to 0.0
    )

    var compoundsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.compound_front) to false,
        context.resources.getString(R.string.compound_rear) to false
    )
    var otherSettingsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.tire_pressure_front) to false,
        context.resources.getString(R.string.tire_pressure_rear) to false,
        context.resources.getString(R.string.camber_front) to false,
        context.resources.getString(R.string.camber_rear) to false,
        context.resources.getString(R.string.brake_disc_front) to false,
        context.resources.getString(R.string.brake_disc_rear) to false,
        context.resources.getString(R.string.brake_bias_text) to false,
        context.resources.getString(R.string.front_brake_duct) to false,
        context.resources.getString(R.string.rear_brake_duct) to false,
        context.resources.getString(R.string.max_pedal_force) to false,
        context.resources.getString(R.string.handbrake_pressure) to false
    )
}