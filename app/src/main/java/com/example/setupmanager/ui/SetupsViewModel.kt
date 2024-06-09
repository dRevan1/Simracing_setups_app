package com.example.setupmanager.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.setupmanager.HierarchyVehicles
import com.example.setupmanager.data.Setups
import com.example.setupmanager.data.SetupsDatabaseRepository
import com.example.setupmanager.data.TablesDao
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class SetupsViewModel(tablesDao: TablesDao, currentVehicle: HierarchyVehicles): ViewModel() {
    val vehicle = tablesDao.getVehicle(currentVehicle.vehicleName)
    val setupListUiState: StateFlow<SetupListUiState> = tablesDao.getSetups(vehicle.id).map { SetupListUiState(it) }
        .stateIn(scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(TIMEOUT_MILLIS),
            initialValue = SetupListUiState()
        )

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}


data class SetupListUiState(val setupList: List<Setups> = listOf())