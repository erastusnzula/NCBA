package com.example.ncbabankapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ncbabankapplication.screens.Home
import com.example.ncbabankapplication.screens.Login
import com.example.ncbabankapplication.screens.Screens
import com.example.ncbabankapplication.screens.Welcome
import com.example.ncbabankapplication.ui.theme.NCBABANKAPPLICATIONTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NCBABANKAPPLICATIONTheme {
                NavigationStack()
            }
        }
    }
}

@Composable
fun NavigationStack(){
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination = Screens.Welcome.route) {
        composable(route=Screens.Welcome.route){
            Welcome(navController=navController)
        }
        composable(route=Screens.Home.route){
            Home(navController=navController)
        }
        composable(route=Screens.Login.route){
            Login(navController=navController)
        }
    }
}