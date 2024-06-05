package com.example.setupmanager.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.setupmanager.HierarchySeries
import com.example.setupmanager.HierarchyVehicles

@Composable
fun SetupsScreen(
    currentVehicle: HierarchyVehicles,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    LazyColumn(contentPadding = PaddingValues(16.dp),
        modifier = Modifier
            .height(200.dp)){
        items(currentSeries.sons.count()) {
            SetupCard(
                vehicleName = currentSeries.sons[it].vehicleName,
                navController = navController,
                modifier = modifier)
        }
    }
}


@Composable
fun SetupCard(
    vehicleName: String,
    navController: NavController,
    modifier: Modifier
) {

    Card(
        modifier
            .padding(10.dp)
    ) {
        Text(vehicleName)
    }
}