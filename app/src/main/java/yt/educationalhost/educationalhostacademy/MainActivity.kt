package yt.educationalhost.educationalhostacademy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import cafe.adriel.voyager.navigator.Navigator
import yt.educationalhost.educationalhostacademy.base.views.BaseScreen
import yt.educationalhost.educationalhostacademy.ui.theme.AIDoctorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {


            AIDoctorTheme {
                Navigator(screen = BaseScreen())
            }
        }
    }
}

