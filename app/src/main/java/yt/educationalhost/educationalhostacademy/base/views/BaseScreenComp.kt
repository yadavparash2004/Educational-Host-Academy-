package yt.educationalhost.educationalhostacademy.base.views

import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import yt.educationalhost.educationalhostacademy.base.components.CustomTopAppBar
import yt.educationalhost.educationalhostacademy.base.components.SideBar
import yt.educationalhost.educationalhostacademy.navigation.BASE
import yt.educationalhost.educationalhostacademy.navigation.BaseNavGraph
import yt.educationalhost.educationalhostacademy.privacy.views.PrivacyPolicy

@Composable
fun BaseScreenComp() {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()
    val drawerIndex = remember { mutableIntStateOf(0) }
    val baseNavController = rememberNavController()


    SideBar(
        drawerState = drawerState,
        drawerIndex = drawerIndex,
        onDrawerItemClicked = {
//            drawerIndex.intValue = it
            when (it) {
                0 -> {
                   baseNavController.popBackStack(
                       BASE.Home , inclusive = false
                   )
                }

                1 -> {
                    baseNavController.navigate(BASE.Privacy)

                }

                else -> {
                    Log.d("EHA", "Error on drawerIndex")
                }
            }


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

                BaseNavGraph(navHostController = baseNavController)


            }


        }
    }


    BackHandler(
        enabled = drawerIndex.intValue != 0
    ) {
        drawerIndex.intValue = 0

    }


}