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
        context.resources.getString(R.string.fender_flare) to 0.0,
        context.resources.getString(R.string.track_bar) to 0.0,
        context.resources.getString(R.string.caster) to 0.0,
        context.resources.getString(R.string.front_wheel_track) to 100.0,
        context.resources.getString(R.string.rear_wheel_track) to 100.0,
        context.resources.getString(R.string.steering_lock) to 26.0,
        context.resources.getString(R.string.vertical) to 20.0,
        context.resources.getString(R.string.wedge) to 0.0
    )

    var settingsMax:HashMap<String, Double> = hashMapOf(
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

    var settingsStep:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.fender_flare) to 0.0,
        context.resources.getString(R.string.track_bar) to 0.0,
        context.resources.getString(R.string.caster) to 0.0,
        context.resources.getString(R.string.front_wheel_track) to 100.0,
        context.resources.getString(R.string.rear_wheel_track) to 100.0,
        context.resources.getString(R.string.steering_lock) to 26.0,
        context.resources.getString(R.string.vertical) to 20.0,
        context.resources.getString(R.string.lateral_text) to 50.0,
        context.resources.getString(R.string.weight_dist_text) to 43.0,
        context.resources.getString(R.string.wedge) to 0.0
    )

    var settingsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.fender_flare) to false,
        context.resources.getString(R.string.track_bar) to false,
        context.resources.getString(R.string.caster) to false,
        context.resources.getString(R.string.front_wheel_track) to false,
        context.resources.getString(R.string.rear_wheel_track) to false,
        context.resources.getString(R.string.steering_lock) to false,
        context.resources.getString(R.string.vertical) to false,
        context.resources.getString(R.string.lateral_text) to false,
        context.resources.getString(R.string.weight_dist_text) to false,
        context.resources.getString(R.string.wedge) to false
    )
}