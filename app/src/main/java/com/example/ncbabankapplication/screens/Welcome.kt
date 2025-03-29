package com.example.ncbabankapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ncbabankapplication.R
import com.example.ncbabankapplication.ui.theme.NCBABANKAPPLICATIONTheme

@Composable
fun Welcome(navController: NavController) {
    Scaffold(
        modifier = Modifier
            .background(colorResource(R.color.white))
            .padding(top = 28.dp, bottom = 28.dp),
        topBar = {},
        bottomBar = {},
        containerColor = colorResource(R.color.white),
        contentColor = colorResource(R.color.secondary),
        contentWindowInsets = WindowInsets.systemBars
    ) {innerPadding->
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

@Preview(showBackground = true)
@Composable
fun WelcomePreview(){
    NCBABANKAPPLICATIONTheme {
        Welcome(navController = rememberNavController())
    }
}