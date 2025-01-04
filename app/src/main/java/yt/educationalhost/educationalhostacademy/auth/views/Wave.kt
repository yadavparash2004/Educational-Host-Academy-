package yt.educationalhost.educationalhostacademy.auth.views

import androidx.compose.foundation.Canvas
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.PathParser


@Composable
fun Wave(modifier: Modifier = Modifier) {
    val color = MaterialTheme.colorScheme.background
    Canvas(modifier) {
        drawPath(
            color = color,
            path = PathParser().parsePathString("M165.79,47.69C73.9,-38.68 16.65,11.7 0,47.69V101H389V12.86C352.88,60.46 257.67,134.06 165.79,47.69Z").toPath()
        )
    }

}