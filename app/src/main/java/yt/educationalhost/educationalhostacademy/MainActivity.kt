package yt.educationalhost.educationalhostacademy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import yt.educationalhost.educationalhostacademy.navigation.MainNavGraph
import yt.educationalhost.educationalhostacademy.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            AppTheme {
                val navHostController = rememberNavController()
                MainNavGraph(navHostController)

            }
        }
    }
}

