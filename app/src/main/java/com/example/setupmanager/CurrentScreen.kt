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
import com.example.setupmanager.data.Setups
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
    //database.insertTracks(database, context)
    //LoadLayouts(database = database)
    database.tablesDao().deleteSetups()

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

@Composable
fun LoadLayouts (database: SetupsDatabase) {

    database.tablesDao().insert(TrackLayout(1, 1, stringResource(id = R.string.layouts_bahrain_endurance)))
    database.tablesDao().insert(TrackLayout(2, 1, stringResource(id = R.string.layouts_bahrain_grand_prix)))
    database.tablesDao().insert(TrackLayout(3, 1, stringResource(id = R.string.layouts_bahrain_inner)))
    database.tablesDao().insert(TrackLayout(4, 1, stringResource(id = R.string.layouts_bahrain_outer)))
    database.tablesDao().insert(TrackLayout(5, 2, stringResource(id = R.string.layouts_melbourne_2021)))
    database.tablesDao().insert(TrackLayout(6, 2, stringResource(id = R.string.layouts_melbourne_2019)))
    database.tablesDao().insert(TrackLayout(7, 3, stringResource(id = R.string.layouts_imola)))
    database.tablesDao().insert(TrackLayout(8, 4, stringResource(id = R.string.layouts_barcelona_gp)))
    database.tablesDao().insert(TrackLayout(9, 4, stringResource(id = R.string.layouts_barcelona_gp_chicane)))
    database.tablesDao().insert(TrackLayout(10, 4, stringResource(id = R.string.layouts_barcelona_national)))
    database.tablesDao().insert(TrackLayout(11, 4, stringResource(id = R.string.layouts_barcelona_national_chicane)))
    database.tablesDao().insert(TrackLayout(12, 4, stringResource(id = R.string.layouts_barcelona_club)))
    database.tablesDao().insert(TrackLayout(13, 5, stringResource(id = R.string.layouts_baku)))
    database.tablesDao().insert(TrackLayout(14, 6, stringResource(id = R.string.layouts_canada)))
    database.tablesDao().insert(TrackLayout(15, 7, stringResource(id = R.string.layouts_silverstone_endurance)))
    database.tablesDao().insert(TrackLayout(16, 7, stringResource(id = R.string.layouts_silverstone_grand_prix)))
    database.tablesDao().insert(TrackLayout(17, 7, stringResource(id = R.string.layouts_silverstone_historic_chicane)))
    database.tablesDao().insert(TrackLayout(18, 7, stringResource(id = R.string.layouts_silverstone_international)))
    database.tablesDao().insert(TrackLayout(19, 7, stringResource(id = R.string.layouts_silverstone_national)))
    database.tablesDao().insert(TrackLayout(20, 8, stringResource(id = R.string.layouts_paul_ricard_gt)))
    database.tablesDao().insert(TrackLayout(21, 8, stringResource(id = R.string.layouts_paul_ricard_gtc)))
    database.tablesDao().insert(TrackLayout(22, 8, stringResource(id = R.string.layouts_paul_ricard_gtp)))
    database.tablesDao().insert(TrackLayout(23, 8, stringResource(id = R.string.layouts_paul_ricard_proto)))
    database.tablesDao().insert(TrackLayout(24, 8, stringResource(id = R.string.layouts_paul_ricard_proto_drs)))
    database.tablesDao().insert(TrackLayout(25, 8, stringResource(id = R.string.layouts_paul_ricard_short)))
    database.tablesDao().insert(TrackLayout(26, 9, stringResource(id = R.string.layouts_hungaroring)))
    database.tablesDao().insert(TrackLayout(27, 10, stringResource(id = R.string.layouts_monza)))
    database.tablesDao().insert(TrackLayout(28, 10, stringResource(id = R.string.layouts_monza_junior)))
    database.tablesDao().insert(TrackLayout(29, 11, stringResource(id = R.string.layouts_mexico)))
    database.tablesDao().insert(TrackLayout(30, 12, stringResource(id = R.string.layouts_brazil)))
    database.tablesDao().insert(TrackLayout(31, 13, stringResource(id = R.string.layouts_abu_dhabi_gp)))
    database.tablesDao().insert(TrackLayout(32, 13, stringResource(id = R.string.layouts_abu_dhabi_corkscrew)))
    database.tablesDao().insert(TrackLayout(33, 13, stringResource(id = R.string.layouts_abu_dhabi_north)))
    database.tablesDao().insert(TrackLayout(34, 13, stringResource(id = R.string.layouts_abu_dhabi_south)))
    database.tablesDao().insert(TrackLayout(35, 14, stringResource(id = R.string.layouts_portimao_car)))
    database.tablesDao().insert(TrackLayout(36, 14, stringResource(id = R.string.layouts_portimao_car_chicane)))
    database.tablesDao().insert(TrackLayout(37, 14, stringResource(id = R.string.layouts_portimao_bike)))
    database.tablesDao().insert(TrackLayout(38, 14, stringResource(id = R.string.layouts_portimao_bike_chicane)))
    database.tablesDao().insert(TrackLayout(39, 15, stringResource(id = R.string.layouts_china_gp)))
    database.tablesDao().insert(TrackLayout(40, 15, stringResource(id = R.string.layouts_china_inter)))
    database.tablesDao().insert(TrackLayout(41, 15, stringResource(id = R.string.layouts_china_long)))
    database.tablesDao().insert(TrackLayout(42, 15, stringResource(id = R.string.layouts_china_short)))
    database.tablesDao().insert(TrackLayout(43, 15, stringResource(id = R.string.layouts_china_short_alter)))
    database.tablesDao().insert(TrackLayout(44, 16, stringResource(id = R.string.layouts_spa)))
    database.tablesDao().insert(TrackLayout(45, 17, stringResource(id = R.string.layouts_redbullring_gp)))
    database.tablesDao().insert(TrackLayout(46, 17, stringResource(id = R.string.layouts_redbullring_bike)))
    database.tablesDao().insert(TrackLayout(47, 17, stringResource(id = R.string.layouts_redbullring_national)))
    database.tablesDao().insert(TrackLayout(48, 18, stringResource(id = R.string.layouts_nurburgring_24h)))
    database.tablesDao().insert(TrackLayout(49, 18, stringResource(id = R.string.layouts_nurburgring_24h_support)))
    database.tablesDao().insert(TrackLayout(50, 18, stringResource(id = R.string.layouts_nurburgring_combined)))
    database.tablesDao().insert(TrackLayout(51, 18, stringResource(id = R.string.layouts_nurburgring_endurance)))
    database.tablesDao().insert(TrackLayout(52, 18, stringResource(id = R.string.layouts_nurburgring_gp)))
    database.tablesDao().insert(TrackLayout(53, 18, stringResource(id = R.string.layouts_nurburgring_gp_chicane)))
    database.tablesDao().insert(TrackLayout(54, 18, stringResource(id = R.string.layouts_nurburgring_nordschleife)))
    database.tablesDao().insert(TrackLayout(55, 18, stringResource(id = R.string.layouts_nurburgring_sprint)))
    database.tablesDao().insert(TrackLayout(56, 18, stringResource(id = R.string.layouts_nurburgring_sprint_chicane)))
    database.tablesDao().insert(TrackLayout(57, 19, stringResource(id = R.string.layouts_zandvoort)))
    database.tablesDao().insert(TrackLayout(58, 19, stringResource(id = R.string.layouts_zandvoort_national)))
    database.tablesDao().insert(TrackLayout(59, 20, stringResource(id = R.string.layouts_suzuka_gp)))
    database.tablesDao().insert(TrackLayout(60, 20, stringResource(id = R.string.layouts_suzuka_bike)))
    database.tablesDao().insert(TrackLayout(61, 20, stringResource(id = R.string.layouts_suzuka_east)))
    database.tablesDao().insert(TrackLayout(62, 20, stringResource(id = R.string.layouts_suzuka_west)))
}