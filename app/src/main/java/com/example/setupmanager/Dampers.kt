package com.example.setupmanager

import android.content.Context

class Dampers(context: Context) {
    var settings:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.slow_bump_front) to 3,
        context.resources.getString(R.string.slow_bump_rear) to 3,
        context.resources.getString(R.string.slow_rebound_front) to 3,
        context.resources.getString(R.string.slow_rebound_rear) to 3,
        context.resources.getString(R.string.fast_bump_front) to 3,
        context.resources.getString(R.string.fast_bump_rear) to 3,
        context.resources.getString(R.string.fast_rebound_front) to 3,
        context.resources.getString(R.string.fast_rebound_rear) to 3
    )

    var settingsMin:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.min_slow_bump_front) to 3,
        context.resources.getString(R.string.min_slow_bump_rear) to 3,
        context.resources.getString(R.string.min_slow_rebound_front) to 3,
        context.resources.getString(R.string.min_slow_rebound_rear) to 3,
        context.resources.getString(R.string.min_fast_bump_front) to 3,
        context.resources.getString(R.string.min_fast_bump_rear) to 3,
        context.resources.getString(R.string.min_fast_rebound_front) to 3,
        context.resources.getString(R.string.min_fast_rebound_rear) to 3
    )

    var settingsMax:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.max_slow_bump_front) to 3,
        context.resources.getString(R.string.max_slow_bump_rear) to 3,
        context.resources.getString(R.string.max_slow_rebound_front) to 3,
        context.resources.getString(R.string.max_slow_rebound_rear) to 3,
        context.resources.getString(R.string.max_fast_bump_front) to 3,
        context.resources.getString(R.string.max_fast_bump_rear) to 3,
        context.resources.getString(R.string.max_fast_rebound_front) to 3,
        context.resources.getString(R.string.max_fast_rebound_rear) to 3
    )

    var settingsStep:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.step_slow_bump_front) to 3,
        context.resources.getString(R.string.step_slow_bump_rear) to 3,
        context.resources.getString(R.string.step_slow_rebound_front) to 3,
        context.resources.getString(R.string.step_slow_rebound_rear) to 3,
        context.resources.getString(R.string.step_fast_bump_front) to 3,
        context.resources.getString(R.string.step_fast_bump_rear) to 3,
        context.resources.getString(R.string.step_fast_rebound_front) to 3,
        context.resources.getString(R.string.step_fast_rebound_rear) to 3
    )

    var settingsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.step_slow_bump_front) to false,
        context.resources.getString(R.string.step_slow_bump_rear) to false,
        context.resources.getString(R.string.step_slow_rebound_front) to false,
        context.resources.getString(R.string.step_slow_rebound_rear) to false,
        context.resources.getString(R.string.step_fast_bump_front) to false,
        context.resources.getString(R.string.step_fast_bump_rear) to false,
        context.resources.getString(R.string.step_fast_rebound_front) to false,
        context.resources.getString(R.string.step_fast_rebound_rear) to false
    )
}