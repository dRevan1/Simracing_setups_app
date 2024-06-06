package com.example.setupmanager.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TablesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(setups: Setups)

    @Query("SELECT * from layouts WHERE id = :id")
    fun getTrackLayouts(id: Int): Flow<List<TrackLayout>>

    @Query("SELECT * from vehicles WHERE id = :id")
    fun getVehicle(id: Int): Flow<Vehicle>

    @Query("SELECT * from tracks WHERE id = :id")
    fun getTrack(id: Int): Flow<Track>

    @Query("SELECT * from setups WHERE carId = :id ORDER BY name ASC")
    fun getSetups(id: Int): Flow<Track>

}