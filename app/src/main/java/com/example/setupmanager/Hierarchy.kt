package com.example.setupmanager

import android.content.Context
import android.content.res.Resources
import androidx.core.content.ContextCompat.getString

class Hierarchy(context: Context) {
    public val games = ArrayList<HierarchyGame>()

    init {
        games.add(HierarchyGame(context.resources.getString(R.string.series_f1), this))
        games.add(HierarchyGame(context.resources.getString(R.string.game_rfactor), this))

        games[0].insertSons(arrayListOf<HierarchySeries>(
            HierarchySeries(context.resources.getString(R.string.series_f1), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_f2), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_f3), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_f4), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_gt2), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_gt3), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_gt4), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_gt_endurance), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_lmh), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_lmp2), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_lmp3), games[0]),
            HierarchySeries(context.resources.getString(R.string.series_other), games[0])
        ))
    }

}