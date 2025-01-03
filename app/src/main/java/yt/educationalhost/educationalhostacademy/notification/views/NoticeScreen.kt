package yt.educationalhost.educationalhostacademy.notification.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import coil.compose.AsyncImage
import yt.educationalhost.educationalhostacademy.notification.model.Notice

data class NoticeScreen(
    val notice: Notice
) : Screen {
    @Composable
    override fun Content() {
        NoticeScreenComp(notice)
    }

    @Composable
    private fun NoticeScreenComp(notice: Notice) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 10.dp)

        ) {

            Text(
                text = notice.title,
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )

//            Image(
//                painter = painterResource(R.drawable.ic_launcher_foreground),
//                contentDescription = null,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .aspectRatio(1f)
//            )

            AsyncImage(
                model = notice.image,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
                    .aspectRatio(1f)
            )

            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )

            Text(
                text = notice.description,
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            Text(
                text = "- " + notice.sentBy ,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Right,
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = notice.date ,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Right,
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )


        }


    }
}