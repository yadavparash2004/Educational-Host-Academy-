package yt.educationalhost.educationalhostacademy.base.views

import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import kotlinx.coroutines.launch
import yt.educationalhost.educationalhostacademy.base.components.CustomTopAppBar
import yt.educationalhost.educationalhostacademy.base.components.SideBar
import yt.educationalhost.educationalhostacademy.home.views.Home
import yt.educationalhost.educationalhostacademy.privacy.views.PrivacyPolicy

class BaseScreen : Screen {
    @Composable
    override fun Content() {
        BaseScreenComp()
    }

    @Composable
    private fun BaseScreenComp() {

        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val coroutineScope = rememberCoroutineScope()
        val drawerIndex =  remember{ mutableIntStateOf(0) }


        SideBar(
            drawerState = drawerState,
            drawerIndex = drawerIndex,
            onDrawerItemClicked = {
                drawerIndex.intValue = it

            }

        ) {
            Scaffold(
                topBar = {
                    CustomTopAppBar(
                        title = "Educational Host Academy",
                        drawerIndex = drawerIndex.intValue,
                        onMenuIconClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }

                        }
                    )
                }

            ) { innerPadding ->
                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                        .verticalScroll(rememberScrollState())
                ) {
                    when(drawerIndex.intValue){
                        0->{
                            Navigator(screen = Home())
                        }
                        1->{
                            PrivacyPolicy()
                        }
                        else -> {
                            Log.d("EHA", "Error on drawerIndex")
                        }
                    }

                }


            }
        }


        BackHandler(
            enabled = drawerIndex.intValue != 0
        ) {
            drawerIndex.intValue = 0

        }


    }
}