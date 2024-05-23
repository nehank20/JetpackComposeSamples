package com.example.nehank.composesamples.navigations

import android.accounts.AccountsException
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController


@Composable
fun NestedNavigation_NavigationFile() {

    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(navController = navController, startDestination = NestedNavigationScreen.SplashScreen.route){
        composable(NestedNavigationScreen.SplashScreen.route){
            SplashScreen {
                navController.navigate(NestedNavigationScreen.Register.route)
            }
        }
        composable(NestedNavigationScreen.Home.route){
            HomeScreen {
                navController.navigate(NestedNavigationScreen.Profile.route)
            }
        }
        composable(NestedNavigationScreen.Profile.route){
            ProfileScreen {
                Toast.makeText(context, "Success : nested navigation ended", Toast.LENGTH_LONG).show()
            }
        }

        navigation(route = NestedNavigationScreen.Register.route, startDestination = NestedNavigationScreen.Register.SignUpScreen.route){
            composable(NestedNavigationScreen.Register.SignUpScreen.route){
                SignupScreen {
                    navController.navigate(NestedNavigationScreen.Register.SignInScreen.route)
                }
            }
            composable(NestedNavigationScreen.Register.SignInScreen.route){
                SignInScreen {
                    navController.navigate(NestedNavigationScreen.Home.route)
                }
            }
        }
    }




}




@Composable
fun SplashScreen(onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier.clickable {
                onClick()
            },
            text = "This is splash screen", style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}

@Composable
fun SignInScreen(onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier.clickable {
                onClick()
            },
            text = "This is signin screen", style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}

@Composable
fun SignupScreen(onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier.clickable {
                onClick()
            },
            text = "This is signup screen", style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}

@Composable
fun HomeScreen(onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier.clickable {
                onClick()
            },
            text = "This is home screen", style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}

@Composable
fun ProfileScreen(onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier.clickable {
                onClick()
            },
            text = "This is profile screen", style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}

sealed class NestedNavigationScreen(val route: String) {
    data object SplashScreen : NestedNavigationScreen("splash")
    data object Register : NestedNavigationScreen("register") {
        data object SignInScreen : NestedNavigationScreen("signin")
        data object SignUpScreen : NestedNavigationScreen("signup")

    }
    data object Home : NestedNavigationScreen("home")
    data object Profile : NestedNavigationScreen("profile")
}