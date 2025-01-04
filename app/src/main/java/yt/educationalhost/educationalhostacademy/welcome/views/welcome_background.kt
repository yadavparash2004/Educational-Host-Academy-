package yt.educationalhost.educationalhostacademy.welcome.views

//import androidx.compose.ui.graphics.PathParser
import androidx.compose.foundation.Canvas
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.vector.PathParser


@Composable
fun WelcomeBackground(modifier: Modifier = Modifier) {
    val backgroundColor = MaterialTheme.colorScheme.primaryContainer
    val onBackgroundColor = MaterialTheme.colorScheme.onPrimaryContainer



    Canvas(modifier = modifier) {
        val width = size.width
        val height = size.height

        // Define the original viewport size of the drawing (e.g., based on your vector data)
        val originalWidth = 390f  // Original width of the drawable (e.g., from the SVG)
        val originalHeight = 844f // Original height of the drawable (e.g., from the SVG)

        // Calculate scale factors for both X and Y axes
        val scaleX = width / originalWidth
        val scaleY = height / originalHeight

        // Use the smaller scale factor to maintain aspect ratio
        val scale = minOf(scaleX, scaleY)


        drawPath(
            path = Path().apply {
                addRect(androidx.compose.ui.geometry.Rect(0f, 0f, width, height))
            },
            color = backgroundColor
        )

        // Apply transformation to scale the drawing
        withTransform({
            translate(left = width-originalWidth-30f, top = height-originalHeight-40f)
            scale(scaleX, scaleY) // Scale drawing based on calculated scale
        }) {
            drawPath(

                path = PathParser().parsePathString("M302,202.5C157.5,137 142.67,46.67 157.5,1.5H390.5V431.71C390.5,433.83 389.72,435.87 388.48,437.59C369.11,464.33 371.39,518.26 263.5,526C152,534 71.33,445.67 0,399V297C90.4,222.2 221.17,333 272.5,387.5C313.5,431.03 376,236.04 302,202.5Z").toPath(),
                color = onBackgroundColor.copy(alpha = 0.4f)
            )

            // Path 4: Oval Shape
            drawPath(
                path = PathParser().parsePathString(
                    "M349,87C349,108.54 361.82,119 340,119C318.18,119 267,108.54 267,87C267,65.46 287.68,48 309.5,48C331.32,48 349,65.46 349,87Z"
                ).toPath(),
                color = backgroundColor
            )
            // Path 5: Small Circle
            drawPath(
                path = PathParser().parsePathString(
                    "M227,32a8,10 0,1 0,16 0a8,10 0,1 0,-16 0z"
                ).toPath(),
                color = backgroundColor
            )

            // Path 6: Another Small Circle
            drawPath(
                path = PathParser().parsePathString(
                    "M361.5,192.5m-9.5,0a9.5,9.5 0,1 1,19 0a9.5,9.5 0,1 1,-19 0"
                ).toPath(),
                color = backgroundColor
            )

            // Path 7: Another Small Circle
            drawPath(
                path = PathParser().parsePathString(
                    "M55.5,380.5m-9.5,0a9.5,9.5 0,1 1,19 0a9.5,9.5 0,1 1,-19 0"
                ).toPath(),
                color = backgroundColor
            )

            // Path 8: Ellipse
            drawPath(
                path = PathParser().parsePathString(
                    "M267,469.5a31.5,18.5 0,1 0,63 0a31.5,18.5 0,1 0,-63 0z"
                ).toPath(),
                color = backgroundColor
            )


            // Path 9: Irregular Ellipse
            drawPath(
                path = PathParser().parsePathString(
                    "M262.52,291.36a22.31,18.5 67.69,1 0,16.94 41.28a22.31,18.5 67.69,1 0,-16.94 -41.28z"
                ).toPath(),
                color = onBackgroundColor.copy(alpha = 0.7f)
            )

        }
        // Path 2: Another Rectangle (same as the first one)




    }


}
