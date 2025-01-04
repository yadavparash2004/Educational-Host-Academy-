package yt.educationalhost.educationalhostacademy.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import yt.educationalhost.educationalhostacademy.auth.Login
import yt.educationalhost.educationalhostacademy.base.views.BaseScreenComp
import yt.educationalhost.educationalhostacademy.welcome.Welcome

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun MainNavGraph(navHostController: NavHostController) {
    SharedTransitionLayout {
        NavHost(
            navController = navHostController,
            startDestination = SCREENS.BaseScreen
        ) {



            composable<SCREENS.Welcome> {
                Welcome(
                    animatedVisibilityScope = this,
                    onLoginClick = {
                        navHostController.navigate(SCREENS.Login)
                    },
                    onSignUpClick = {},
                    onNameClick = {}
                )
            }


            composable<SCREENS.Login> {
                Login(
                    animatedVisibilityScope = this
                )
            }



            composable<SCREENS.BaseScreen> {
                BaseScreenComp()
            }
        }
    }


}