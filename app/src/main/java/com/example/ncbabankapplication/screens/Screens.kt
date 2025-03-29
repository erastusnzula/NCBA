package com.example.ncbabankapplication.screens

sealed class Screens(val route: String) {
    data object Welcome: Screens("welcome")
}