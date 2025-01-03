package yt.educationalhost.educationalhostacademy.base.constants

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MiscellaneousServices
import androidx.compose.material.icons.filled.PrivacyTip
import yt.educationalhost.educationalhostacademy.base.model.DrawerItem

object Drawer {
    val drawerItems = listOf(
        DrawerItem(
            icon = Icons.Default.Home,
            title = "Home",
            contentDescription = " Home",
            index = 0
        ),
        DrawerItem(
            icon = Icons.Default.PrivacyTip,
            title = "Privacy Policy",
            contentDescription = " Privacy Policy",
            index = 1
        ),
        DrawerItem(
            icon = Icons.Default.Email,
            title = "Feedback/Suggestion",
            contentDescription = " Feedback/Suggestion",
            index = 2
        ),
        DrawerItem(
            icon = Icons.Default.AccountCircle,
            title = "Profile",
            contentDescription = " Profile",
            index = 3
        ),
        DrawerItem(
            icon = Icons.Default.MiscellaneousServices,
            title = "Our Facilities",
            contentDescription = "Our Facilities",
            index = 4
        ),

        DrawerItem(
            icon = Icons.Default.Info,
            title = "About Us",
            contentDescription = " About Us",
            index = 5
        )

    )
}