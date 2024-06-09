package com.example.setupmanager.data
import android.content.Context
import androidx.compose.ui.res.stringResource
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.setupmanager.R

@Database(entities = [Vehicle::class, Track::class, TrackLayout::class, Setups::class], version = 5, exportSchema = false)
abstract class SetupsDatabase : RoomDatabase() {

    abstract fun tablesDao(): TablesDao

    companion object {
        @Volatile
        private var Instance: SetupsDatabase? = null

        fun getDatabase(context: Context): SetupsDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, SetupsDatabase::class.java, "setups_database").allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }

    fun insertTracks(database: SetupsDatabase, context: Context) {
        database.tablesDao().insert(Track(1, context.resources.getString(R.string.tracks_bahrain)))
        database.tablesDao().insert(Track(2, context.resources.getString(R.string.tracks_melbourne)))
        database.tablesDao().insert(Track(3, context.resources.getString(R.string.tracks_imola)))
        database.tablesDao().insert(Track(4, context.resources.getString(R.string.tracks_barcelona)))
        database.tablesDao().insert(Track(5, context.resources.getString(R.string.tracks_baku)))
        database.tablesDao().insert(Track(6, context.resources.getString(R.string.tracks_canada)))
        database.tablesDao().insert(Track(7, context.resources.getString(R.string.tracks_silverstone)))
        database.tablesDao().insert(Track(8, context.resources.getString(R.string.tracks_paul_ricard)))
        database.tablesDao().insert(Track(9, context.resources.getString(R.string.tracks_hungaroring)))
        database.tablesDao().insert(Track(10, context.resources.getString(R.string.tracks_monza)))
        database.tablesDao().insert(Track(11, context.resources.getString(R.string.tracks_mexico)))
        database.tablesDao().insert(Track(12, context.resources.getString(R.string.tracks_brazil)))
        database.tablesDao().insert(Track(13, context.resources.getString(R.string.tracks_abu_dhabi)))
        database.tablesDao().insert(Track(14, context.resources.getString(R.string.tracks_portimao)))
        database.tablesDao().insert(Track(15, context.resources.getString(R.string.tracks_china)))
        database.tablesDao().insert(Track(16, context.resources.getString(R.string.tracks_spa)))
        database.tablesDao().insert(Track(17, context.resources.getString(R.string.tracks_redbullring)))
        database.tablesDao().insert(Track(18, context.resources.getString(R.string.tracks_nurburgring)))
        database.tablesDao().insert(Track(19, context.resources.getString(R.string.tracks_zandvoort)))
        database.tablesDao().insert(Track(20, context.resources.getString(R.string.tracks_suzuka)))
    }
}