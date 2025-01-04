package yt.educationalhost.educationalhostacademy.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import yt.educationalhost.educationalhostacademy.home.views.HomeScreenComp

@Composable
fun BaseNavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController , startDestination = BASE.Home){
        composable<BASE.Home> {
            HomeScreenComp()
        }


        composable<BASE.Privacy> {
            Box(
                Modifier.fillMaxSize( ), contentAlignment = Alignment.Center
            ){
                Text("Privacy Policy ")
            }
        }

    }

}