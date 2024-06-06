package com.example.setupmanager.data

import kotlinx.coroutines.flow.Flow

class OfflineSetupsRepository(private val tablesDao: TablesDao): SetupsDatabaseRepository {
    override suspend fun insertSetup(setup: Setups) = tablesDao.insert(setup)
    override suspend fun updateSetup(setup: Setups) = tablesDao.update(setup)
    override suspend fun deleteSetup(setup: Setups) = tablesDao.delete(setup)
    override fun getTrackLayoutsStream(trackId: Int): Flow<List<TrackLayout>> = tablesDao.getTrackLayouts(trackId)
    override fun getVehicleStream(carId: Int): Flow<Vehicle?> = tablesDao.getVehicle(carId)
    override fun getTrackStream(trackId: Int): Flow<Track?> = tablesDao.getTrack(trackId)
    override fun getVehicleSetupsStream(carId: Int): Flow<List<Setups>> = tablesDao.getSetups(carId)
}