package com.example.ncbabankapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Welcome(navController: NavController) {
    Scaffold {innerPadding->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            Text(
                text = "Welcome"
            )

        }
    }
}