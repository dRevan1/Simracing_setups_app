package com.example.setupmanager

import androidx.annotation.StringRes
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

enum class CurrentScreen(@StringRes val title: Int) {
    Start(title = R.string.titles_home_screen),
    Series(title = R.string.titles_series),
    Cars(title = R.string.titles_car),
    Setups(title = R.string.titles_setups)
}


@Composable
fun SetupManagerApp(

    navController: NavHostController = rememberNavController()
) {


}