package com.example.setupmanager.ui

import androidx.compose.foundation.clickable
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
import com.example.setupmanager.HierarchyGame
import com.example.setupmanager.HierarchySeries

@Composable
fun VehiclesScreen(
    currentSeries: HierarchySeries,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    LazyColumn(contentPadding = PaddingValues(16.dp),
        modifier = Modifier
            .height(200.dp)){
        items(currentSeries.sons.count()) {
            VehicleCard(
                vehicleName = currentSeries.sons[it].vehicleName,
                navController = navController,
                modifier = modifier)
        }
    }
}


@Composable
fun VehicleCard(
    vehicleName: String,
    navController: NavController,
    modifier: Modifier) {

    Card(
        modifier
            .padding(10.dp)
    ) {
        Text(vehicleName)
    }
}