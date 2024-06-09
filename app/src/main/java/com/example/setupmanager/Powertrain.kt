package com.example.setupmanager

import android.content.Context
import androidx.compose.ui.res.stringResource
import java.io.Serializable

class Powertrain(context: Context) {
    var engineMix: String = "Race" //dokončiť neskôr
    var torqueSplit: String = "RWD"

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

    var engineSettingsMin:HashMap<String, Int> = hashMapOf(
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
    var gearSettingsMin: HashMap<String, String> = hashMapOf(
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
    var differentialMin:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.pump) to 0,
        context.resources.getString(R.string.power) to 0,
        context.resources.getString(R.string.coast) to 0,
        context.resources.getString(R.string.preload) to 0
    )

    var engineSettingsMax:HashMap<String, Int> = hashMapOf(
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
    var gearSettingsMax: HashMap<String, String> = hashMapOf(
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
    var differentialMax:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.pump) to 0,
        context.resources.getString(R.string.power) to 0,
        context.resources.getString(R.string.coast) to 0,
        context.resources.getString(R.string.preload) to 0
    )

    var engineSettingsStep:HashMap<String, Int> = hashMapOf(
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
    var gearSettingsStep: HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.gear_1st) to 0.0,
        context.resources.getString(R.string.gear_2nd) to 0.0,
        context.resources.getString(R.string.gear_3rd) to 0.0,
        context.resources.getString(R.string.gear_4th) to 0.0,
        context.resources.getString(R.string.gear_5th) to 0.0,
        context.resources.getString(R.string.gear_6th) to 0.0,
        context.resources.getString(R.string.gear_7th) to 0.0,
        context.resources.getString(R.string.gear_8th) to 0.0,
        context.resources.getString(R.string.gear_final) to 0.0,
        context.resources.getString(R.string.gear_reverse) to 0.0
    )
    var differentialStep:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.pump) to 0,
        context.resources.getString(R.string.power) to 0,
        context.resources.getString(R.string.coast) to 0,
        context.resources.getString(R.string.preload) to 0
    )

    var engineSettingsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.starting_fuel) to false,
        context.resources.getString(R.string.rev_limiter) to false,
        context.resources.getString(R.string.radiator_tape) to false,
        context.resources.getString(R.string.boost_map) to false,
        context.resources.getString(R.string.brake_map) to false,
        context.resources.getString(R.string.onboard_tc) to false,
        context.resources.getString(R.string.onboard_tc_cut) to false,
        context.resources.getString(R.string.onboard_tc_angle) to false,
        context.resources.getString(R.string.onboard_abs) to false,
    )
    var gearSettingsEnable: HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.gear_1st) to false,
        context.resources.getString(R.string.gear_2nd) to false,
        context.resources.getString(R.string.gear_3rd) to false,
        context.resources.getString(R.string.gear_4th) to false,
        context.resources.getString(R.string.gear_5th) to false,
        context.resources.getString(R.string.gear_6th) to false,
        context.resources.getString(R.string.gear_7th) to false,
        context.resources.getString(R.string.gear_8th) to false,
        context.resources.getString(R.string.gear_final) to false,
        context.resources.getString(R.string.gear_reverse) to false
    )
    var autoGearboxEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.auto_upshift) to false,
        context.resources.getString(R.string.auto_downshift) to false,
    )
    var differentialEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.pump) to false,
        context.resources.getString(R.string.power) to false,
        context.resources.getString(R.string.coast) to false,
        context.resources.getString(R.string.preload) to false
    )
}