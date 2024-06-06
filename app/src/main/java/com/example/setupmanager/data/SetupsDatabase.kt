package com.example.setupmanager.data
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [Vehicle::class, Track::class, TrackLayout::class, Setups::class], version = 1, exportSchema = false)
abstract class SetupsDatabase : RoomDatabase() {

    abstract fun setupsDatabase(): SetupsDatabase

    companion object {
        @Volatile
        private var Instance: SetupsDatabase? = null

        fun getDatabase(context: Context): SetupsDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, SetupsDatabase::class.java, "setups_database")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}