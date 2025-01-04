package yt.educationalhost.educationalhostacademy.auth.views

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun InputField(
    icon: ImageVector ,
    placeHolder : String,
    value : String ,
    onValueChange : (String) -> Unit

) {

    TextField(
        value = value,
        onValueChange = onValueChange,
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = placeHolder
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color.Transparent
        ),
        placeholder = {
            Text(placeHolder)
        }
    )

}