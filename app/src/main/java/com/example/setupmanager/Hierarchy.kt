package com.example.setupmanager

import android.content.Context
import android.content.res.Resources
import androidx.core.content.ContextCompat.getString
import java.io.File
import java.io.InputStream

class Hierarchy(context: Context) {
    val games = ArrayList<HierarchyGame>()

    init {
        games.add(HierarchyGame(context.resources.getString(R.string.game_rfactor), this))
        var output: String
        var seriesVehicles:List<String>

        var input: InputStream = context.assets.open("rFactor_series.txt")        // https://www.geeksforgeeks.org/how-to-read-a-text-file-in-android/
        var size: Int = input.available()
        var buffer = ByteArray(size)
        input.read(buffer)
        output = String(buffer)

        var lines:List<String> = output.split(",")
        games[0].insertSons(lines)

        // vozidlá pre F1 rFactor 2
        input = context.assets.open("rFactor_vehicles.txt")        // https://www.geeksforgeeks.org/how-to-read-a-text-file-in-android/
        size = input.available()
        buffer = ByteArray(size)
        input.read(buffer)
        output = String(buffer)
        lines = output.split(";")

        for (i in 0..lines.lastIndex) {
            seriesVehicles = lines[i].split(",")
            games[0].sons[i].insertSons(seriesVehicles, context)
        }
    }

}