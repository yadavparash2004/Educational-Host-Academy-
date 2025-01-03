package yt.educationalhost.educationalhostacademy.base.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

data class DrawerItem(
    val icon : ImageVector = Icons.Default.Home,
    val title : String = "Home",
    val contentDescription : String = "",
    val index : Int
)
