package com.example.nestednavigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nestednavigation.BottomBarScreens
import com.example.nestednavigation.screens.homeContent.InfoScreen
import com.example.nestednavigation.screens.homeContent.SettingScreen
import com.example.nestednavigation.screens.homeContent.ShareScreen

@Composable
fun HomeNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = BottomBarScreens.Share.route) {
        composable(BottomBarScreens.Share.route) {
            ShareScreen(BottomBarScreens.Share.route, onClick = {})
        }
        composable(BottomBarScreens.Info.route) {
            InfoScreen(BottomBarScreens.Info.route, onClick = {})
        }
        composable(BottomBarScreens.Setting.route) {
            SettingScreen(BottomBarScreens.Setting.route, onClick = {})
        }
    }
}