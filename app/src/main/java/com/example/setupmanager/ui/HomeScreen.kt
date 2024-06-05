package com.example.setupmanager.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.setupmanager.NavigationScreens
import com.example.setupmanager.R

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        modifier = Modifier
            .height(100.dp)){
        items(1) {
            GameChoiceButton(gameName = stringResource(id = R.string.game_rfactor), onClick = {
                navController.navigate(route = NavigationScreens.Series.name)
            })
        }
    }
}


@Composable
fun GameChoiceButton(
    gameName: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier.widthIn(min = 250.dp)
    ) {
        Text(gameName)
    }
}