package yt.educationalhost.educationalhostacademy.home.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.VideoFile
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import yt.educationalhost.educationalhostacademy.ui.theme.Orange
import yt.educationalhost.educationalhostacademy.ui.theme.PeriWinkle
import yt.educationalhost.educationalhostacademy.ui.theme.Pink


@Composable
private fun GridItem(
    modifier: Modifier = Modifier,
    containerColor: Color = MaterialTheme.colorScheme.primaryContainer,
    imageVector: ImageVector = Icons.Default.Add,
    text: String = "Add",
    onClick: () -> Unit
) {
    Box(modifier = modifier) {
        Card(
            modifier = Modifier.padding(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = containerColor
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .width(70.dp)
                    .aspectRatio(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Icon(imageVector = imageVector, contentDescription = "")
                Text(
                    text = text,
                    textAlign = TextAlign.Center,
                    fontSize = 10.sp,
                    lineHeight = 10.sp
                )
            }

        }
    }
}


@Composable
fun EventsAndMediaRow(
    modifier: Modifier = Modifier,
    onItemClick : (Int) -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        GridItem(
            containerColor = Orange,
            imageVector = Icons.Default.CalendarMonth,
            text = "Academic Calender"
        ) { onItemClick(0)}
        GridItem(
            containerColor = Pink,
            imageVector = Icons.Default.Image,
            text = "Gallery "

        ) { onItemClick(1)}
        GridItem(
            containerColor = PeriWinkle,
            imageVector = Icons.Default.VideoFile,
            text = "Videos "
        ) { onItemClick(2)}
    }
}

@Preview
@Composable
private fun Test() {
    EventsAndMediaRow(){

    }
}