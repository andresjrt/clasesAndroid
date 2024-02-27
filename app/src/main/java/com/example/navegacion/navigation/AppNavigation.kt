package com.example.navegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacion.screens.FirstScreen
import com.example.navegacion.screens.SecondScreen

@Composable
fun AppNavigation () {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route){
        composable(route= AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
    }
}