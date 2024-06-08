package com.example.setupmanager

import android.content.Context

class WheelsBrakes(context: Context) {
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

    var compoundsMin:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.min_compound_front) to 0,
        context.resources.getString(R.string.min_compound_rear) to 0
    )
    var otherSettingsMin:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.min_tire_pressure_front) to 0.0,
        context.resources.getString(R.string.min_tire_pressure_rear) to 0.0,
        context.resources.getString(R.string.min_camber_front) to 0.0,
        context.resources.getString(R.string.min_camber_rear) to 0.0,
        context.resources.getString(R.string.min_brake_disc_front) to 2.0,
        context.resources.getString(R.string.min_brake_disc_rear) to 2.0,
        context.resources.getString(R.string.min_brake_bias_front) to 0.0,
        context.resources.getString(R.string.min_brake_bias_rear) to 0.0,
        context.resources.getString(R.string.min_front_brake_duct) to 1.0,
        context.resources.getString(R.string.min_rear_brake_duct) to 1.0,
        context.resources.getString(R.string.min_max_pedal_force) to 90.0,
        context.resources.getString(R.string.min_handbrake_pressure) to 0.0
    )

    var compoundsMax:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.max_compound_front) to 0,
        context.resources.getString(R.string.max_compound_rear) to 0
    )
    var otherSettingsMax:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.max_tire_pressure_front) to 0.0,
        context.resources.getString(R.string.max_tire_pressure_rear) to 0.0,
        context.resources.getString(R.string.max_camber_front) to 0.0,
        context.resources.getString(R.string.max_camber_rear) to 0.0,
        context.resources.getString(R.string.max_brake_disc_front) to 2.0,
        context.resources.getString(R.string.max_brake_disc_rear) to 2.0,
        context.resources.getString(R.string.max_brake_bias_front) to 0.0,
        context.resources.getString(R.string.max_brake_bias_rear) to 0.0,
        context.resources.getString(R.string.max_front_brake_duct) to 1.0,
        context.resources.getString(R.string.max_rear_brake_duct) to 1.0,
        context.resources.getString(R.string.max_max_pedal_force) to 90.0,
        context.resources.getString(R.string.max_handbrake_pressure) to 0.0
    )

    var otherSettingsStep:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.step_tire_pressure_front) to 0.0,
        context.resources.getString(R.string.step_tire_pressure_rear) to 0.0,
        context.resources.getString(R.string.step_camber_front) to 0.0,
        context.resources.getString(R.string.step_camber_rear) to 0.0,
        context.resources.getString(R.string.step_brake_disc_front) to 2.0,
        context.resources.getString(R.string.step_brake_disc_rear) to 2.0,
        context.resources.getString(R.string.step_brake_bias_front) to 0.0,
        context.resources.getString(R.string.step_brake_bias_rear) to 0.0,
        context.resources.getString(R.string.step_front_brake_duct) to 1.0,
        context.resources.getString(R.string.step_rear_brake_duct) to 1.0,
        context.resources.getString(R.string.step_max_pedal_force) to 90.0,
        context.resources.getString(R.string.step_handbrake_pressure) to 0.0
    )

    var compoundsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.enable_compound_front) to false,
        context.resources.getString(R.string.enable_compound_rear) to false
    )
    var otherSettingsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.enable_tire_pressure_front) to false,
        context.resources.getString(R.string.enable_tire_pressure_rear) to false,
        context.resources.getString(R.string.enable_camber_front) to false,
        context.resources.getString(R.string.enable_camber_rear) to false,
        context.resources.getString(R.string.enable_brake_disc_front) to false,
        context.resources.getString(R.string.enable_brake_disc_rear) to false,
        context.resources.getString(R.string.enable_brake_bias_front) to false,
        context.resources.getString(R.string.enable_brake_bias_rear) to false,
        context.resources.getString(R.string.enable_front_brake_duct) to false,
        context.resources.getString(R.string.enable_rear_brake_duct) to false,
        context.resources.getString(R.string.enable_max_pedal_force) to false,
        context.resources.getString(R.string.enable_handbrake_pressure) to false
    )
}