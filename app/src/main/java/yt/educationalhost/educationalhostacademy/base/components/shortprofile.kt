package yt.educationalhost.educationalhostacademy.base.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShortProfile(modifier: Modifier = Modifier) {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp , bottom = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "profile",
            modifier = Modifier.size(50.dp)
        )
        Column(
            modifier = Modifier.padding(horizontal = 5.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Raghwan Yadhubansi")
            Text(text = "Class : 10 A | Roll no: 20")

        }
    }

}

@Preview
@Composable
private fun Default() {
    ShortProfile()
}