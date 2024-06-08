package com.example.setupmanager

import android.content.Context

class Chassis(context: Context) {
    var settings:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.fender_flare) to 0.0,
        context.resources.getString(R.string.track_bar) to 0.0,
        context.resources.getString(R.string.caster) to 0.0,
        context.resources.getString(R.string.front_wheel_track) to 100.0,
        context.resources.getString(R.string.rear_wheel_track) to 100.0,
        context.resources.getString(R.string.steering_lock) to 26.0,
        context.resources.getString(R.string.vertical) to 20.0,
        context.resources.getString(R.string.lateral_first) to 50.0,
        context.resources.getString(R.string.lateral_second) to 50.0,
        context.resources.getString(R.string.weight_dist_front) to 43.0,
        context.resources.getString(R.string.weight_dist_rear) to 57.0,
        context.resources.getString(R.string.wedge) to 0.0
    )

    var settingsMin:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.min_fender_flare) to 0.0,
        context.resources.getString(R.string.min_track_bar) to 0.0,
        context.resources.getString(R.string.min_caster) to 0.0,
        context.resources.getString(R.string.min_front_wheel_track) to 100.0,
        context.resources.getString(R.string.min_rear_wheel_track) to 100.0,
        context.resources.getString(R.string.min_steering_lock) to 26.0,
        context.resources.getString(R.string.min_vertical) to 20.0,
        context.resources.getString(R.string.min_lateral_first) to 50.0,
        context.resources.getString(R.string.min_lateral_second) to 50.0,
        context.resources.getString(R.string.min_weight_dist_front) to 43.0,
        context.resources.getString(R.string.min_weight_dist_rear) to 57.0,
        context.resources.getString(R.string.min_wedge) to 0.0
    )

    var settingsMax:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.max_fender_flare) to 0.0,
        context.resources.getString(R.string.max_track_bar) to 0.0,
        context.resources.getString(R.string.max_caster) to 0.0,
        context.resources.getString(R.string.max_front_wheel_track) to 100.0,
        context.resources.getString(R.string.max_rear_wheel_track) to 100.0,
        context.resources.getString(R.string.max_steering_lock) to 26.0,
        context.resources.getString(R.string.max_vertical) to 20.0,
        context.resources.getString(R.string.max_lateral_first) to 50.0,
        context.resources.getString(R.string.max_lateral_second) to 50.0,
        context.resources.getString(R.string.max_weight_dist_front) to 43.0,
        context.resources.getString(R.string.max_weight_dist_rear) to 57.0,
        context.resources.getString(R.string.max_wedge) to 0.0
    )

    var settingsStep:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.step_fender_flare) to 0.0,
        context.resources.getString(R.string.step_track_bar) to 0.0,
        context.resources.getString(R.string.step_caster) to 0.0,
        context.resources.getString(R.string.step_front_wheel_track) to 100.0,
        context.resources.getString(R.string.step_rear_wheel_track) to 100.0,
        context.resources.getString(R.string.step_steering_lock) to 26.0,
        context.resources.getString(R.string.step_vertical) to 20.0,
        context.resources.getString(R.string.step_lateral_first) to 50.0,
        context.resources.getString(R.string.step_lateral_second) to 50.0,
        context.resources.getString(R.string.step_weight_dist_front) to 43.0,
        context.resources.getString(R.string.step_weight_dist_rear) to 57.0,
        context.resources.getString(R.string.step_wedge) to 0.0
    )

    var settingsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.enable_fender_flare) to false,
        context.resources.getString(R.string.enable_track_bar) to false,
        context.resources.getString(R.string.enable_caster) to false,
        context.resources.getString(R.string.enable_front_wheel_track) to false,
        context.resources.getString(R.string.enable_rear_wheel_track) to false,
        context.resources.getString(R.string.enable_steering_lock) to false,
        context.resources.getString(R.string.enable_vertical) to false,
        context.resources.getString(R.string.enable_lateral_first) to false,
        context.resources.getString(R.string.enable_lateral_second) to false,
        context.resources.getString(R.string.enable_weight_dist_front) to false,
        context.resources.getString(R.string.enable_weight_dist_rear) to false,
        context.resources.getString(R.string.enable_wedge) to false
    )
}