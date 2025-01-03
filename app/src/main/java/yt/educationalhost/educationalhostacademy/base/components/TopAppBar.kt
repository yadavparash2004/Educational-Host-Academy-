package yt.educationalhost.educationalhostacademy.base.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar(
    title: String,
    drawerIndex : Int ,
    onMenuIconClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {

        Card(
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 50.dp,
                bottomEnd = 50.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier.padding(start = 15.dp , top = 25.dp),
//
//            ) {
//
//                IconButton(onClick = {
//                    onMenuIconClick()
//                }) {
//                    Icon(
//                        imageVector = Icons.Default.Menu,
//                        contentDescription = "menu Icon",
//                        tint = MaterialTheme.colorScheme.background ,
//                        modifier = Modifier.size(22.dp)
//                    )
//                }
//
//                Text(
//                    text = title,
//                    fontSize = 22.sp,
//                    fontWeight = FontWeight(700)
//                )
//
//
//
//
//            }

            TopAppBar(
                title = {
                    Text(text = title)
                },
                navigationIcon = {
                    IconButton(onClick = { onMenuIconClick() }) {
                        Icon(
                            imageVector =  Icons.Default.Menu,
                            contentDescription = "Open menu ")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )

            AnimatedVisibility(visible =  intArrayOf(0,1,2).contains(drawerIndex) ) {
                ShortProfile()
            }


        }


    }

}


@Preview
@Composable
private fun TopBarPreview() {
//    CustomTopAppBar(
//        title = "AI Doctor",
//        onMenuIconClick = {
//
//        }
//    )
}