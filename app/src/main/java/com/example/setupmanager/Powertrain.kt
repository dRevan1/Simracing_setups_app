package com.example.setupmanager

import android.content.Context
import androidx.compose.ui.res.stringResource
import java.io.Serializable

class Powertrain(context: Context) {
    var engineSettings:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.starting_fuel) to 0,
        context.resources.getString(R.string.rev_limiter) to 0,
        context.resources.getString(R.string.radiator_tape) to 0,
        context.resources.getString(R.string.boost_map) to 0,
        context.resources.getString(R.string.brake_map) to 0,
        context.resources.getString(R.string.onboard_tc) to 0,
        context.resources.getString(R.string.onboard_tc_cut) to 0,
        context.resources.getString(R.string.onboard_tc_angle) to 0,
        context.resources.getString(R.string.onboard_abs) to 0,
    )
    var engineMix: String = "Race"

    var gearSettings: HashMap<String, String> = hashMapOf(
        context.resources.getString(R.string.gear_1st) to "0_0",
        context.resources.getString(R.string.gear_2nd) to "0_0",
        context.resources.getString(R.string.gear_3rd) to "0_0",
        context.resources.getString(R.string.gear_4th) to "0_0",
        context.resources.getString(R.string.gear_5th) to "0_0",
        context.resources.getString(R.string.gear_6th) to "0_0",
        context.resources.getString(R.string.gear_7th) to "0_0",
        context.resources.getString(R.string.gear_8th) to "0_0",
        context.resources.getString(R.string.gear_final) to "0_0",
        context.resources.getString(R.string.gear_reverse) to "0_0"
    )

    var autoGearbox:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.auto_upshift) to false,
        context.resources.getString(R.string.auto_downshift) to false,
    )

    var differential:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.pump) to 0,
        context.resources.getString(R.string.power) to 0,
        context.resources.getString(R.string.coast) to 0,
        context.resources.getString(R.string.preload) to 0
    )
    var torqueSplit: String = "RWD"

}