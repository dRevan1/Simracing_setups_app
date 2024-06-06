package com.example.setupmanager.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.setupmanager.NavigationScreens
import com.example.setupmanager.HierarchyGame


@Composable
fun SeriesScreen(
    currentGame: HierarchyGame,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    LazyColumn(contentPadding = PaddingValues(16.dp),
        modifier = Modifier
            .height(200.dp)){
        items(currentGame.sons.count()) {
            SeriesCard(
                seriesName = currentGame.sons[it].seriesName,
                navController = navController,
                seriesIndex = it,
                modifier = modifier)
        }
    }
}


@Composable
fun SeriesCard(
    seriesName: String,
    navController: NavController,
    seriesIndex: Int,
    modifier: Modifier) {

    Card(
        modifier
            .padding(10.dp)
            .clickable {
                navController.navigate(route = (NavigationScreens.Cars.name + "/$seriesIndex"))
            }
    ) {
        Text(seriesName)
    }
}