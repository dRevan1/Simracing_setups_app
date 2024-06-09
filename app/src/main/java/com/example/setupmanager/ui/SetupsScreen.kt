package com.example.setupmanager.ui

import android.content.Context
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.setupmanager.HierarchySeries
import com.example.setupmanager.HierarchyVehicles

@Composable
fun SetupsScreen(
    currentVehicle: HierarchyVehicles,
    context: Context,
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: SetupsViewModel
) {
    val setupListUiState by viewModel.setupListUiState.collectAsState()
    if (setupListUiState.setupList.isEmpty()) {
        Text("No setups here")
    } else {
        LazyColumn(contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .height(200.dp)){
            items(setupListUiState.setupList.count()) {
                SetupCard(
                    setupName = setupListUiState.setupList[it].name,
                    navController = navController,
                    modifier = modifier)
            }
        }
    }
}


@Composable
fun SetupCard(
    setupName: String,
    navController: NavController,
    modifier: Modifier
) {
    Card(
        modifier
            .padding(10.dp)
    ) {
        Text(setupName)
    }
}