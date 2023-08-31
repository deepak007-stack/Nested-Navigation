package com.example.nestednavigation.screens.homeContent

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShareScreen(route : String, onClick : () -> Unit) {

    Box(
        modifier = Modifier.fillMaxSize().padding(bottom = 50.dp),
        contentAlignment = Alignment.Center
    ) {
        // Your other content
        Text(
            text = "Share Screen",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}