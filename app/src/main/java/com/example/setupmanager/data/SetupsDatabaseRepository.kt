package com.example.setupmanager.data

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import kotlinx.coroutines.flow.Flow

interface SetupsDatabaseRepository {

    fun insertSetup(setup: Setups)
    fun insertVehicle(vehicle: Vehicle)
    fun insertTrack(track: Track)
    fun insertLayout(layout: TrackLayout)
    suspend fun updateSetup(setup: Setups)
    suspend fun deleteSetup(setup: Setups)
    fun deleteTracks()
    fun deleteLayouts()
    fun deleteSetups()
    fun getTrackLayoutsStream(trackId: Int): Flow<List<TrackLayout>>
    fun getVehicleStream(carId: Int): Flow<Vehicle?>
    fun getVehicleStream(carName: String): Vehicle
    fun getTrackStream(trackId: Int): Flow<Track?>
    fun getVehicleSetupsStream(carId: Int): Flow<List<Setups>>

}