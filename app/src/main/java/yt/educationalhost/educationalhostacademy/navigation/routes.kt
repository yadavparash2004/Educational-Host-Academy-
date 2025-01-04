package yt.educationalhost.educationalhostacademy.navigation

import kotlinx.serialization.Serializable

@Serializable
object SCREENS {

    @Serializable
    data object Welcome

    @Serializable
    data object Login


    @Serializable
    data object SignUp



    @Serializable
    data object BaseScreen

}



@Serializable
object BASE{
    @Serializable
    data object Home




    @Serializable
    data object Privacy

}



