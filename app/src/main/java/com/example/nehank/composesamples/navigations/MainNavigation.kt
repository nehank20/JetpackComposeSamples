package com.example.nehank.composesamples.navigations

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nehank.composesamples.MainViewModel
import com.example.nehank.composesamples.navigations.screens.FirstScreen
import com.example.nehank.composesamples.navigations.screens.SecondScreen

@Composable
fun MainNavigation() {

    val navController = rememberNavController()
    val mainViewModel : MainViewModel = viewModel()

    NavHost(navController = navController, startDestination = Screen.First.route){
        composable(Screen.First.route){
            FirstScreen(mainViewModel){
                navController.navigate(Screen.Second.route)
            }
        }

        composable(Screen.Second.route){
            SecondScreen(mainViewModel) {
                navController.navigateUp()
            }
        }
    }
}

sealed class Screen(val route : String) {
    data object First : Screen("first")
    data object Second : Screen("second")
}