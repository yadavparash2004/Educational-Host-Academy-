package yt.educationalhost.educationalhostacademy.base.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DismissibleDrawerSheet
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import kotlinx.coroutines.launch
import yt.educationalhost.educationalhostacademy.base.constants.Drawer

@Composable
fun SideBar(
    drawerState: DrawerState,
    drawerIndex : MutableIntState,
    onDrawerItemClicked: (Int) -> Unit,
    content: @Composable () -> Unit
) {

//    var selectedIndex by remember { mutableIntStateOf(0) }
    val coroutineScope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = drawerState.isOpen,
        drawerContent = {
            DismissibleDrawerSheet(
                modifier = Modifier
                    .width(350.dp)
                    .fillMaxHeight()
                    .padding(end = 60.dp),
                drawerContainerColor = MaterialTheme.colorScheme.primaryContainer,
                drawerShape = RoundedCornerShape(20.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                            contentDescription = "App Descriptive Image ",
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(20.dp)
//                        )
                        AsyncImage(
                            model = "https://mahilasanakisan.org.np/sms/assets/logo.png",
                            contentDescription = "logo",
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )


                    }

                    for (item in Drawer.drawerItems) {
                        NavigationDrawerItem(
                            label = {
                                Text(
                                    text = item.title,
                                    fontSize = 20.sp,
                                    fontWeight = if (drawerIndex.intValue == item.index) FontWeight(700) else FontWeight(
                                        400
                                    )
                                )

                            },
                            selected = item.index == drawerIndex.intValue,
                            onClick = {
                                drawerIndex.intValue = item.index
                                onDrawerItemClicked(item.index)
                                coroutineScope.launch {
                                    drawerState.close()
                                }

                            },
                            colors = NavigationDrawerItemDefaults.colors(
                                selectedContainerColor = MaterialTheme.colorScheme.background,
                                selectedTextColor = MaterialTheme.colorScheme.primary,
                                unselectedContainerColor = MaterialTheme.colorScheme.primaryContainer
                            ),
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                            icon = {
                                Icon(
                                    imageVector = item.icon,
                                    contentDescription = item.contentDescription,
                                    tint = if (drawerIndex.intValue == item.index) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onBackground
                                )
                            }
                        )

                    }


                }
            }
        }
    ) {
        content()
    }
}


@Preview
@Composable
private fun SideBarPreview() {
    val drawerState = DrawerState(DrawerValue.Open)

//    AIDoctorTheme {
//        SideBar(
//            drawerState, onDrawerItemClicked = {
//
//            }
//        ) {
//
//        }
//    }

}