package com.example.setupmanager.data

import kotlinx.coroutines.flow.Flow

class OfflineSetupsRepository(private val tablesDao: TablesDao): SetupsDatabaseRepository {
    override fun insertSetup(setup: Setups) = tablesDao.insert(setup)
    override fun insertVehicle(vehicle: Vehicle) = tablesDao.insert(vehicle)
    override fun insertTrack(track: Track) = tablesDao.insert(track)
    override fun insertLayout(layout: TrackLayout) = tablesDao.insert(layout)
    override suspend fun updateSetup(setup: Setups) = tablesDao.update(setup)
    override suspend fun deleteSetup(setup: Setups) = tablesDao.delete(setup)
    override fun deleteTracks() = tablesDao.deleteTracks()
    override fun deleteLayouts() = tablesDao.deleteLayouts()
    override fun deleteSetups() = tablesDao.deleteSetups()
    override fun getTrackLayoutsStream(trackId: Int): Flow<List<TrackLayout>> = tablesDao.getTrackLayouts(trackId)
    override fun getVehicleStream(carId: Int): Flow<Vehicle?> = tablesDao.getVehicle(carId)
    override fun getVehicleStream(carName: String): Vehicle  = tablesDao.getVehicle(carName)
    override fun getTrackStream(trackId: Int): Flow<Track?> = tablesDao.getTrack(trackId)
    override fun getVehicleSetupsStream(carId: Int): Flow<List<Setups>> = tablesDao.getSetups(carId)
}