package yt.educationalhost.educationalhostacademy.home.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FounderMessage() {
    Card () {
        Text(text = "Hello Dear !!")
    }

}

@Preview
@Composable
private fun Default() {
    FounderMessage()
}