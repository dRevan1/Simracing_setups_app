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
}