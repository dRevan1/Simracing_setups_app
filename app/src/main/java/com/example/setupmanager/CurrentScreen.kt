package com.example.setupmanager

import android.content.Context
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.setupmanager.data.SetupsDatabase
import com.example.setupmanager.data.Track
import com.example.setupmanager.data.TrackLayout
import com.example.setupmanager.ui.HomeScreen
import com.example.setupmanager.ui.SeriesScreen
import com.example.setupmanager.ui.SetupsScreen
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
    val database: SetupsDatabase = SetupsDatabase.getDatabase(context = context)
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_melbourne)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_imola)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_barcelona)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_baku)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_canada)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_silverstone)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_paul_ricard)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_hungaroring)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_monza)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_mexico)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_brazil)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_abu_dhabi)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_portimao)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_china)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_spa)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_redbullring)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_nurburgring)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_zandvoort)))
    database.tablesDao().insert(Track(0, stringResource(id = R.string.tracks_suzuka)))

    database.tablesDao().insert(TrackLayout(0, 3, stringResource(id = R.string.layouts_bahrain_endurance)))
    database.tablesDao().insert(TrackLayout(0, 3, stringResource(id = R.string.layouts_bahrain_grand_prix)))
    database.tablesDao().insert(TrackLayout(0, 3, stringResource(id = R.string.layouts_bahrain_inner)))
    database.tablesDao().insert(TrackLayout(0, 3, stringResource(id = R.string.layouts_bahrain_outer)))
    database.tablesDao().insert(TrackLayout(0, 4, stringResource(id = R.string.layouts_melbourne_2021)))
    database.tablesDao().insert(TrackLayout(0, 4, stringResource(id = R.string.layouts_melbourne_2019)))
    database.tablesDao().insert(TrackLayout(0, 5, stringResource(id = R.string.layouts_imola)))
    database.tablesDao().insert(TrackLayout(0, 6, stringResource(id = R.string.layouts_barcelona_gp)))
    database.tablesDao().insert(TrackLayout(0, 6, stringResource(id = R.string.layouts_barcelona_gp_chicane)))
    database.tablesDao().insert(TrackLayout(0, 6, stringResource(id = R.string.layouts_barcelona_national)))
    database.tablesDao().insert(TrackLayout(0, 6, stringResource(id = R.string.layouts_barcelona_national_chicane)))
    database.tablesDao().insert(TrackLayout(0, 6, stringResource(id = R.string.layouts_barcelona_club)))
    database.tablesDao().insert(TrackLayout(0, 7, stringResource(id = R.string.layouts_baku)))
    database.tablesDao().insert(TrackLayout(0, 8, stringResource(id = R.string.layouts_canada)))
    database.tablesDao().insert(TrackLayout(0, 9, stringResource(id = R.string.layouts_silverstone_endurance)))
    database.tablesDao().insert(TrackLayout(0, 9, stringResource(id = R.string.layouts_silverstone_grand_prix)))
    database.tablesDao().insert(TrackLayout(0, 9, stringResource(id = R.string.layouts_silverstone_historic_chicane)))
    database.tablesDao().insert(TrackLayout(0, 9, stringResource(id = R.string.layouts_silverstone_international)))
    database.tablesDao().insert(TrackLayout(0, 9, stringResource(id = R.string.layouts_silverstone_national)))
    database.tablesDao().insert(TrackLayout(0, 10, stringResource(id = R.string.layouts_paul_ricard_gt)))
    database.tablesDao().insert(TrackLayout(0, 10, stringResource(id = R.string.layouts_paul_ricard_gtc)))
    database.tablesDao().insert(TrackLayout(0, 10, stringResource(id = R.string.layouts_paul_ricard_gtp)))
    database.tablesDao().insert(TrackLayout(0, 10, stringResource(id = R.string.layouts_paul_ricard_proto)))
    database.tablesDao().insert(TrackLayout(0, 10, stringResource(id = R.string.layouts_paul_ricard_proto_drs)))
    database.tablesDao().insert(TrackLayout(0, 10, stringResource(id = R.string.layouts_paul_ricard_short)))
    database.tablesDao().insert(TrackLayout(0, 11, stringResource(id = R.string.layouts_hungaroring)))
    database.tablesDao().insert(TrackLayout(0, 12, stringResource(id = R.string.layouts_monza)))
    database.tablesDao().insert(TrackLayout(0, 12, stringResource(id = R.string.layouts_monza_junior)))
    database.tablesDao().insert(TrackLayout(0, 13, stringResource(id = R.string.layouts_mexico)))
    database.tablesDao().insert(TrackLayout(0, 14, stringResource(id = R.string.layouts_brazil)))
    database.tablesDao().insert(TrackLayout(0, 15, stringResource(id = R.string.layouts_abu_dhabi_gp)))
    database.tablesDao().insert(TrackLayout(0, 15, stringResource(id = R.string.layouts_abu_dhabi_corkscrew)))
    database.tablesDao().insert(TrackLayout(0, 15, stringResource(id = R.string.layouts_abu_dhabi_north)))
    database.tablesDao().insert(TrackLayout(0, 15, stringResource(id = R.string.layouts_abu_dhabi_south)))
    database.tablesDao().insert(TrackLayout(0, 16, stringResource(id = R.string.layouts_portimao_car)))
    database.tablesDao().insert(TrackLayout(0, 16, stringResource(id = R.string.layouts_portimao_car_chicane)))
    database.tablesDao().insert(TrackLayout(0, 16, stringResource(id = R.string.layouts_portimao_bike)))
    database.tablesDao().insert(TrackLayout(0, 16, stringResource(id = R.string.layouts_portimao_bike_chicane)))
    database.tablesDao().insert(TrackLayout(0, 17, stringResource(id = R.string.layouts_china_gp)))
    database.tablesDao().insert(TrackLayout(0, 17, stringResource(id = R.string.layouts_china_inter)))
    database.tablesDao().insert(TrackLayout(0, 17, stringResource(id = R.string.layouts_china_long)))
    database.tablesDao().insert(TrackLayout(0, 17, stringResource(id = R.string.layouts_china_short)))
    database.tablesDao().insert(TrackLayout(0, 17, stringResource(id = R.string.layouts_china_short_alter)))
    database.tablesDao().insert(TrackLayout(0, 18, stringResource(id = R.string.layouts_spa)))
    database.tablesDao().insert(TrackLayout(0, 19, stringResource(id = R.string.layouts_redbullring_gp)))
    database.tablesDao().insert(TrackLayout(0, 19, stringResource(id = R.string.layouts_redbullring_bike)))
    database.tablesDao().insert(TrackLayout(0, 19, stringResource(id = R.string.layouts_redbullring_national)))
    database.tablesDao().insert(TrackLayout(0, 20, stringResource(id = R.string.layouts_nurburgring_24h)))
    database.tablesDao().insert(TrackLayout(0, 20, stringResource(id = R.string.layouts_nurburgring_24h_support)))
    database.tablesDao().insert(TrackLayout(0, 20, stringResource(id = R.string.layouts_nurburgring_combined)))
    database.tablesDao().insert(TrackLayout(0, 20, stringResource(id = R.string.layouts_nurburgring_endurance)))
    database.tablesDao().insert(TrackLayout(0, 20, stringResource(id = R.string.layouts_nurburgring_gp)))
    database.tablesDao().insert(TrackLayout(0, 20, stringResource(id = R.string.layouts_nurburgring_gp_chicane)))
    database.tablesDao().insert(TrackLayout(0, 20, stringResource(id = R.string.layouts_nurburgring_nordschleife)))
    database.tablesDao().insert(TrackLayout(0, 20, stringResource(id = R.string.layouts_nurburgring_sprint)))
    database.tablesDao().insert(TrackLayout(0, 20, stringResource(id = R.string.layouts_nurburgring_sprint_chicane)))
    database.tablesDao().insert(TrackLayout(0, 21, stringResource(id = R.string.layouts_zandvoort)))
    database.tablesDao().insert(TrackLayout(0, 21, stringResource(id = R.string.layouts_zandvoort_national)))
    database.tablesDao().insert(TrackLayout(0, 22, stringResource(id = R.string.layouts_suzuka_gp)))
    database.tablesDao().insert(TrackLayout(0, 22, stringResource(id = R.string.layouts_suzuka_bike)))
    database.tablesDao().insert(TrackLayout(0, 22, stringResource(id = R.string.layouts_suzuka_east)))
    database.tablesDao().insert(TrackLayout(0, 22, stringResource(id = R.string.layouts_suzuka_west)))

    var seriesParentIndex = 0
    var vehicleParentIndex = 0

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
            seriesParentIndex = seriesIndex.arguments?.getInt("seriesIndex")!!
            VehiclesScreen(
                currentSeries = hierarchy.games[0].sons[seriesParentIndex],
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
            vehicleParentIndex = setupsIndex.arguments?.getInt("seriesIndex")!!
            SetupsScreen(
                currentVehicle = hierarchy.games[0].sons[seriesParentIndex].sons[vehicleParentIndex],
                navController = navController,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }

}