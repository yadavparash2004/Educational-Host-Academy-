package yt.educationalhost.educationalhostacademy.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import yt.educationalhost.educationalhostacademy.notification.model.Notice

@Composable
fun SmallNotice(
    modifier: Modifier = Modifier,
    notice: Notice,
    onClick : (notice : Notice) -> Unit
) {
    Box(modifier = modifier.fillMaxWidth()) {
        OutlinedCard(
            onClick = { onClick(notice) },
            colors = CardDefaults.outlinedCardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,

                ),
            border = BorderStroke(2.dp, MaterialTheme.colorScheme.primary),
            modifier = Modifier.padding(10.dp)

        ) {
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text(
                    text = notice.title,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = notice.date,
                        fontWeight = FontWeight.Bold
                    )
                }

            }

        }
    }
}

@Preview
@Composable
private fun Test() {
//    SmallNotice()

}