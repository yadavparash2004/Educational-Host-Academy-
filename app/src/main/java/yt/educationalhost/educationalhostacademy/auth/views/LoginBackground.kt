package yt.educationalhost.educationalhostacademy.auth.views

import androidx.compose.foundation.Canvas
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.vector.PathParser

@Composable
fun LoginBackGround(modifier: Modifier = Modifier) {
    val backgroundColor = MaterialTheme.colorScheme.primaryContainer
    val onBackgroundColor = MaterialTheme.colorScheme.onPrimaryContainer
    Canvas(
        modifier = modifier
    ) {

        val width = size.width
        val height = size.height

        val originalWidth = 390f
        val originalHeight = 844f

        val scaleX = width  / originalWidth
        val scaleY = height / originalHeight

        val scale = minOf(scaleY , scaleX)
//
//        drawPath(
//            path = Path().apply {
//                addRect(Rect(0f, 0f, width, height))
//            },
//            color = backgroundColor
//        )

        drawRect(
            color = backgroundColor,
            topLeft = Offset(0f , 0f ),
            size = Size(width , height )
        )


//        Lets start drawing

        withTransform({
            translate(left = width-originalWidth-30f, top = height-originalHeight-40f)
            scale(scaleX, scaleY) // Scale drawing based on calculated scale
        }){
            drawPath(
                path = PathParser().parsePathString("M390,178.5C310,196 444,-43.5 0,179V0H390V178.5Z").toPath(),
                color = onBackgroundColor.copy(alpha = 0.7f)
            )

            drawPath(
                path = PathParser().parsePathString(
                    "M128,83a10.5,7 0,1 0,21 0a10.5,7 0,1 0,-21 0z"
                ).toPath(),
                color = backgroundColor
            )

            drawPath(
                path = PathParser().parsePathString(
                    "M277,116a10.5,7 0,1 0,21 0a10.5,7 0,1 0,-21 0z"
                ).toPath(),
                color = onBackgroundColor.copy(alpha = 0.7f)
            )



            drawPath(
                path = PathParser().parsePathString(
                    "M322,186a10.5,7 0,1 0,21 0a10.5,7 0,1 0,-21 0z"
                ).toPath(),
                color = onBackgroundColor.copy(alpha = 0.7f)
            )
            drawPath(
                path = PathParser().parsePathString(
                    "M315,46.5a17,17.5 0,1 0,34 0a17,17.5 0,1 0,-34 0z"
                ).toPath(),
                color = backgroundColor
            )

            drawPath(
                path = PathParser().parsePathString(
                    "M298,146a21.5,23 0,1 0,43 0a21.5,23 0,1 0,-43 0z"
                ).toPath(),
                color = onBackgroundColor.copy(alpha = 0.7f)
            )

            drawPath(
                path = PathParser().parsePathString(
                    "M69.34,320.69a21.5,30.67 82.62,1 0,5.52 42.64a21.5,30.67 82.62,1 0,-5.52 -42.64z"
                ).toPath(),
                color = onBackgroundColor.copy(alpha = 0.7f)
            )






        }
    }
}