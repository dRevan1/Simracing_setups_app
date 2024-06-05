package com.example.setupmanager

import android.content.Context
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.setupmanager.ui.HomeScreen
import com.example.setupmanager.ui.SeriesScreen
import com.example.setupmanager.ui.VehiclesScreen

enum class NavigationScreens(@StringRes val title: Int) {
    Start(title = R.string.titles_home_screen),
    Series(title = R.string.titles_series),
    Cars(title = (R.string.titles_car)),
    Setups(title = R.string.titles_setups)
}


@Composable
fun SetupManagerApp(
    context: Context,
    navController: NavHostController = rememberNavController()
) {
    val hierarchy = Hierarchy(context)

    NavHost(
        navController = navController,
        startDestination = NavigationScreens.Start.name,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        composable(route = NavigationScreens.Start.name) {
            HomeScreen(
                navController = navController,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        composable(route = NavigationScreens.Series.name) {
            SeriesScreen(
                currentGame = hierarchy.games[0],
                navController = navController,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        composable(route = NavigationScreens.Cars.name + "/{seriesIndex}", arguments = listOf(
            navArgument(name = "seriesIndex") {
                type = NavType.IntType
            })
        ) { seriesIndex ->
            VehiclesScreen(
                currentSeries = hierarchy.games[0].sons[seriesIndex.arguments?.getInt("seriesIndex")!!],
                navController = navController,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        composable(route = NavigationScreens.Setups.name + "/{setupsIndex}", arguments = listOf(
            navArgument(name = "setupsIndex") {
                type = NavType.IntType
            })
        ) { setupsIndex ->
            VehiclesScreen(
                currentSeries = hierarchy.games[0].sons[setupsIndex.arguments?.getInt("setupsIndex")!!],
                navController = navController,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }

}