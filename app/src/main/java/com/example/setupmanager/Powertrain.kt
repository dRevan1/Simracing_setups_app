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
        context.resources.getString(R.string.min_starting_fuel) to 0,
        context.resources.getString(R.string.min_rev_limiter) to 0,
        context.resources.getString(R.string.min_radiator_tape) to 0,
        context.resources.getString(R.string.min_boost_map) to 0,
        context.resources.getString(R.string.min_brake_map) to 0,
        context.resources.getString(R.string.min_onboard_tc) to 0,
        context.resources.getString(R.string.min_onboard_tc_cut) to 0,
        context.resources.getString(R.string.min_onboard_tc_angle) to 0,
        context.resources.getString(R.string.min_onboard_abs) to 0,
    )
    var gearSettingsMin: HashMap<String, String> = hashMapOf(
        context.resources.getString(R.string.min_gear_1st) to "0_0",
        context.resources.getString(R.string.min_gear_2nd) to "0_0",
        context.resources.getString(R.string.min_gear_3rd) to "0_0",
        context.resources.getString(R.string.min_gear_4th) to "0_0",
        context.resources.getString(R.string.min_gear_5th) to "0_0",
        context.resources.getString(R.string.min_gear_6th) to "0_0",
        context.resources.getString(R.string.min_gear_7th) to "0_0",
        context.resources.getString(R.string.min_gear_8th) to "0_0",
        context.resources.getString(R.string.min_gear_final) to "0_0",
        context.resources.getString(R.string.min_gear_reverse) to "0_0"
    )
    var differentialMin:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.min_pump) to 0,
        context.resources.getString(R.string.min_power) to 0,
        context.resources.getString(R.string.min_coast) to 0,
        context.resources.getString(R.string.min_preload) to 0
    )

    var engineSettingsMax:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.max_starting_fuel) to 0,
        context.resources.getString(R.string.max_rev_limiter) to 0,
        context.resources.getString(R.string.max_radiator_tape) to 0,
        context.resources.getString(R.string.max_boost_map) to 0,
        context.resources.getString(R.string.max_brake_map) to 0,
        context.resources.getString(R.string.max_onboard_tc) to 0,
        context.resources.getString(R.string.max_onboard_tc_cut) to 0,
        context.resources.getString(R.string.max_onboard_tc_angle) to 0,
        context.resources.getString(R.string.max_onboard_abs) to 0,
    )
    var gearSettingsMax: HashMap<String, String> = hashMapOf(
        context.resources.getString(R.string.max_gear_1st) to "0_0",
        context.resources.getString(R.string.max_gear_2nd) to "0_0",
        context.resources.getString(R.string.max_gear_3rd) to "0_0",
        context.resources.getString(R.string.max_gear_4th) to "0_0",
        context.resources.getString(R.string.max_gear_5th) to "0_0",
        context.resources.getString(R.string.max_gear_6th) to "0_0",
        context.resources.getString(R.string.max_gear_7th) to "0_0",
        context.resources.getString(R.string.max_gear_8th) to "0_0",
        context.resources.getString(R.string.max_gear_final) to "0_0",
        context.resources.getString(R.string.max_gear_reverse) to "0_0"
    )
    var differentialMax:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.max_pump) to 0,
        context.resources.getString(R.string.max_power) to 0,
        context.resources.getString(R.string.max_coast) to 0,
        context.resources.getString(R.string.max_preload) to 0
    )

    var engineSettingsStep:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.step_starting_fuel) to 0,
        context.resources.getString(R.string.step_rev_limiter) to 0,
        context.resources.getString(R.string.step_radiator_tape) to 0,
        context.resources.getString(R.string.step_boost_map) to 0,
        context.resources.getString(R.string.step_brake_map) to 0,
        context.resources.getString(R.string.step_onboard_tc) to 0,
        context.resources.getString(R.string.step_onboard_tc_cut) to 0,
        context.resources.getString(R.string.step_onboard_tc_angle) to 0,
        context.resources.getString(R.string.step_onboard_abs) to 0,
    )
    var gearSettingsStep: HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.step_gear_1st) to 0.0,
        context.resources.getString(R.string.step_gear_2nd) to 0.0,
        context.resources.getString(R.string.step_gear_3rd) to 0.0,
        context.resources.getString(R.string.step_gear_4th) to 0.0,
        context.resources.getString(R.string.step_gear_5th) to 0.0,
        context.resources.getString(R.string.step_gear_6th) to 0.0,
        context.resources.getString(R.string.step_gear_7th) to 0.0,
        context.resources.getString(R.string.step_gear_8th) to 0.0,
        context.resources.getString(R.string.step_gear_final) to 0.0,
        context.resources.getString(R.string.step_gear_reverse) to 0.0
    )
    var differentialStep:HashMap<String, Int> = hashMapOf(
        context.resources.getString(R.string.step_pump) to 0,
        context.resources.getString(R.string.step_power) to 0,
        context.resources.getString(R.string.step_coast) to 0,
        context.resources.getString(R.string.step_preload) to 0
    )

    var engineSettingsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.enable_starting_fuel) to false,
        context.resources.getString(R.string.enable_rev_limiter) to false,
        context.resources.getString(R.string.enable_radiator_tape) to false,
        context.resources.getString(R.string.enable_boost_map) to false,
        context.resources.getString(R.string.enable_brake_map) to false,
        context.resources.getString(R.string.enable_onboard_tc) to false,
        context.resources.getString(R.string.enable_onboard_tc_cut) to false,
        context.resources.getString(R.string.enable_onboard_tc_angle) to false,
        context.resources.getString(R.string.enable_onboard_abs) to false,
    )
    var gearSettingsEnable: HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.enable_gear_1st) to false,
        context.resources.getString(R.string.enable_gear_2nd) to false,
        context.resources.getString(R.string.enable_gear_3rd) to false,
        context.resources.getString(R.string.enable_gear_4th) to false,
        context.resources.getString(R.string.enable_gear_5th) to false,
        context.resources.getString(R.string.enable_gear_6th) to false,
        context.resources.getString(R.string.enable_gear_7th) to false,
        context.resources.getString(R.string.enable_gear_8th) to false,
        context.resources.getString(R.string.enable_gear_final) to false,
        context.resources.getString(R.string.enable_gear_reverse) to false
    )
    var autoGearboxEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.enable_auto_upshift) to false,
        context.resources.getString(R.string.enable_auto_downshift) to false,
    )
    var differentialEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.enable_pump) to false,
        context.resources.getString(R.string.enable_power) to false,
        context.resources.getString(R.string.enable_coast) to false,
        context.resources.getString(R.string.enable_preload) to false
    )
}