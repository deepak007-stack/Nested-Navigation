package com.example.nestednavigation.screens

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigation.MyBottomBar
import com.example.nestednavigation.graph.HomeNavGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController = rememberNavController()) {

    Scaffold(
        bottomBar = { MyBottomBar(navController = navController) }
    ) {

        HomeNavGraph(navController)
    }
}