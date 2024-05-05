package com.example.setupmanager

import android.content.Context
import android.content.res.Resources
import androidx.core.content.ContextCompat.getString
import java.io.File
import java.io.InputStream

class Hierarchy(context: Context) {
    public val games = ArrayList<HierarchyGame>()

    init {
        games.add(HierarchyGame(context.resources.getString(R.string.game_rfactor), this))
        games.add(HierarchyGame(context.resources.getString(R.string.series_f1), this))

        var output: String
        val input: InputStream
        input = context.assets.open("rFactor_series.txt")        // https://www.geeksforgeeks.org/how-to-read-a-text-file-in-android/
        val size: Int = input.available()
        val buffer = ByteArray(size)
        input.read(buffer)
        output = String(buffer)

        var lines:List<String> = output.split(",")
        games[0].insertSons(lines)
        games[1].insertSons(listOf("F1", "F2"))

    }

}