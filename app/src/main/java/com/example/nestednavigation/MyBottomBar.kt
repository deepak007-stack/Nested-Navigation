package com.example.nestednavigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MyBottomBar(navController: NavController) {

    BottomAppBar(
        modifier = Modifier.height(60.dp),
        contentPadding = PaddingValues(horizontal = 40.dp),
        containerColor = BottomAppBarDefaults.containerColor,
        contentColor = contentColorFor(MaterialTheme.colorScheme.primaryContainer),
        tonalElevation = BottomAppBarDefaults.ContainerElevation,
        windowInsets = BottomAppBarDefaults.windowInsets
    ) {

        IconButton(onClick = { navController.navigate(BottomBarScreens.Share.route) }) {
            Icon(Icons.Default.Share, contentDescription = "share")
        }

        Spacer(modifier = Modifier.weight(0.7f))

        IconButton(onClick = { navController.navigate(BottomBarScreens.Info.route) }) {
            Icon(Icons.Default.Info, contentDescription = "info")
        }

        Spacer(modifier = Modifier.weight(0.7f))

        IconButton(onClick = { navController.navigate(BottomBarScreens.Setting.route) }) {
            Icon(Icons.Default.Settings, contentDescription = "settings")
        }

    }
}

sealed class BottomBarScreens(val route: String) {

    object Share : BottomBarScreens("share_screen")
    object Info : BottomBarScreens("info_screen")
    object Setting : BottomBarScreens("setting_screen")
}
