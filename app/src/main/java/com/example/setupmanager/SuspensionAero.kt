package com.example.setupmanager

import android.content.Context

class SuspensionAero(context: Context) {
    var settings:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.spring_rate_front) to 0.0,
        context.resources.getString(R.string.spring_rate_rear) to 0.0,
        context.resources.getString(R.string.tender_spring_rate_front) to 0.0,
        context.resources.getString(R.string.tender_spring_rate_rear) to 0.0,
        context.resources.getString(R.string.packers_front) to 0.0,
        context.resources.getString(R.string.packers_rear) to 0.0,
        context.resources.getString(R.string.ride_height_front) to 0.0,
        context.resources.getString(R.string.ride_height_rear) to 0.0,
        context.resources.getString(R.string.spring_rubber_front) to 0.0,
        context.resources.getString(R.string.spring_rubber_rear) to 0.0,
        context.resources.getString(R.string.antiroll_bar_front) to 0.0,
        context.resources.getString(R.string.antiroll_bar_rear) to 0.0,
        context.resources.getString(R.string.toe_in_front) to 0.0,
        context.resources.getString(R.string.toe_in_rear) to 0.0,
        context.resources.getString(R.string.toe_in_offset_front) to 0.0,
        context.resources.getString(R.string.toe_in_offset_rear) to 0.0,
        context.resources.getString(R.string.front_downforce) to 1.0,
        context.resources.getString(R.string.rear_downforce) to 0.0
    )

    var settingsMin:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.spring_rate_text) to 0.0,
        context.resources.getString(R.string.tender_spring_rate_text) to 0.0,
        context.resources.getString(R.string.packers_text) to 0.0,
        context.resources.getString(R.string.ride_height_front) to 0.0,
        context.resources.getString(R.string.ride_height_rear) to 0.0,
        context.resources.getString(R.string.spring_rubber_text) to 0.0,
        context.resources.getString(R.string.antiroll_bar_front) to 0.0,
        context.resources.getString(R.string.antiroll_bar_rear) to 0.0,
        context.resources.getString(R.string.toe_in_front) to 0.0,
        context.resources.getString(R.string.toe_in_rear) to 0.0,
        context.resources.getString(R.string.toe_in_offset_front) to 0.0,
        context.resources.getString(R.string.toe_in_offset_rear) to 0.0,
        context.resources.getString(R.string.front_downforce) to 1.0,
        context.resources.getString(R.string.rear_downforce) to 0.0
    )

    var settingsMax:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.spring_rate_text) to 0.0,
        context.resources.getString(R.string.tender_spring_rate_text) to 0.0,
        context.resources.getString(R.string.packers_text) to 0.0,
        context.resources.getString(R.string.ride_height_front) to 0.0,
        context.resources.getString(R.string.ride_height_rear) to 0.0,
        context.resources.getString(R.string.spring_rubber_text) to 0.0,
        context.resources.getString(R.string.antiroll_bar_front) to 0.0,
        context.resources.getString(R.string.antiroll_bar_rear) to 0.0,
        context.resources.getString(R.string.toe_in_front) to 0.0,
        context.resources.getString(R.string.toe_in_rear) to 0.0,
        context.resources.getString(R.string.toe_in_offset_front) to 0.0,
        context.resources.getString(R.string.toe_in_offset_rear) to 0.0,
        context.resources.getString(R.string.front_downforce) to 1.0,
        context.resources.getString(R.string.rear_downforce) to 0.0
    )

    var settingsStep:HashMap<String, Double> = hashMapOf(
        context.resources.getString(R.string.spring_rate_text) to 0.0,
        context.resources.getString(R.string.tender_spring_rate_text) to 0.0,
        context.resources.getString(R.string.packers_text) to 0.0,
        context.resources.getString(R.string.ride_height_text) to 0.0,
        context.resources.getString(R.string.spring_rubber_text) to 0.0,
        context.resources.getString(R.string.antiroll_bar_front) to 0.0,
        context.resources.getString(R.string.antiroll_bar_rear) to 0.0,
        context.resources.getString(R.string.toe_in_text) to 0.0,
        context.resources.getString(R.string.toe_in_offset_text) to 0.0,
        context.resources.getString(R.string.front_downforce) to 1.0,
        context.resources.getString(R.string.rear_downforce) to 0.0
    )

    var settingsEnable:HashMap<String, Boolean> = hashMapOf(
        context.resources.getString(R.string.spring_rate_front) to false,
        context.resources.getString(R.string.spring_rate_rear) to false,
        context.resources.getString(R.string.tender_spring_rate_front) to false,
        context.resources.getString(R.string.tender_spring_rate_rear) to false,
        context.resources.getString(R.string.packers_front) to false,
        context.resources.getString(R.string.packers_rear) to false,
        context.resources.getString(R.string.ride_height_front) to false,
        context.resources.getString(R.string.ride_height_rear) to false,
        context.resources.getString(R.string.spring_rubber_front) to false,
        context.resources.getString(R.string.spring_rubber_rear) to false,
        context.resources.getString(R.string.antiroll_bar_front) to false,
        context.resources.getString(R.string.antiroll_bar_rear) to false,
        context.resources.getString(R.string.toe_in_front) to false,
        context.resources.getString(R.string.toe_in_rear) to false,
        context.resources.getString(R.string.toe_in_offset_front) to false,
        context.resources.getString(R.string.toe_in_offset_rear) to false,
        context.resources.getString(R.string.front_downforce) to false,
        context.resources.getString(R.string.rear_downforce) to false
    )

}