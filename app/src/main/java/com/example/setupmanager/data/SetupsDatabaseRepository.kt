package com.example.setupmanager.data

import kotlinx.coroutines.flow.Flow

interface SetupsDatabaseRepository {

    suspend fun insertSetup(setup: Setups)
    suspend fun updateSetup(setup: Setups)
    suspend fun deleteSetup(setup: Setups)
    fun getTrackLayoutsStream(trackId: Int): Flow<List<TrackLayout>>
    fun getVehicleStream(carId: Int): Flow<Vehicle?>
    fun getTrackStream(trackId: Int): Flow<Track?>
    fun getVehicleSetupsStream(carId: Int): Flow<List<Setups>>

}