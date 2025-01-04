package yt.educationalhost.educationalhostacademy.auth

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import yt.educationalhost.educationalhostacademy.R
import yt.educationalhost.educationalhostacademy.auth.views.InputField
import yt.educationalhost.educationalhostacademy.auth.views.LoginBackGround

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.Login(
    modifier: Modifier = Modifier,
    animatedVisibilityScope: AnimatedVisibilityScope,
    scrollState: ScrollState = rememberScrollState(),

    ) {

    Column(
        modifier = modifier
            .fillMaxSize()
//            .verticalScroll(scrollState)
            .imePadding()


    ) {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.login_bg),
                contentDescription = "login_background_image ",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )

//            LoginBackGround( modifier = Modifier.fillMaxSize())

            Column(
                modifier = Modifier
                    .fillMaxSize(),
//                verticalArrangement = Arrangement.Bottom
            ) {

                Spacer(Modifier.weight(1f))

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.BottomEnd

                ) {
                    Image(
                        painter = painterResource(R.drawable.wave),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(
                                Alignment.BottomEnd
                            )

                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Welcome \n Back ",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            lineHeight = 35.sp,
                            modifier = Modifier
                                .padding(
                                    bottom = 200.dp,
                                    start = 20.dp
                                )
                        )
                        Image(
                            painter = painterResource(R.drawable.eduhost_transparent),
                            contentDescription = "logo",
                            modifier = Modifier
                                .padding(end = 20.dp)
                                .height(150.dp)
                                .width(150.dp)
                                .sharedElement(
                                    state = rememberSharedContentState("logo_anim"),
                                    animatedVisibilityScope = animatedVisibilityScope,
                                    boundsTransform = { _, _ ->
                                        tween(1000)
                                    }
                                )
                        )

                    }

                }
             BelowContent()



            }




        }


    }
}


@Composable
fun BelowContent(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(
                PaddingValues(20.dp, 0.dp, 20.dp, 20.dp)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InputField(
            icon = Icons.Default.Phone,
            placeHolder = "Phone Number",
            value = "",
            onValueChange = {}
        )
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        InputField(
            icon = Icons.Default.Lock,
            placeHolder = "Password",
            value = "",
            onValueChange = {}
        )
        Text(
            text = "Forgot password? ",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            textAlign = TextAlign.End,
            color = MaterialTheme.colorScheme.onPrimaryContainer

        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 5.dp),
            onClick = {
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.onPrimaryContainer),


            ) {
            Text(
                text = "Log in ",
                color = MaterialTheme.colorScheme.onPrimary,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalDivider(
                modifier = Modifier
                    .weight(1f)
            )
            Text(
                text = "or",
                modifier = Modifier.padding(horizontal = 5.dp),
                fontWeight = FontWeight.Bold
            )
            HorizontalDivider(
                modifier = Modifier
                    .weight(1f)
            )
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 5.dp),
            onClick = {},
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            border = BorderStroke(
                width = 1.dp, color = MaterialTheme.colorScheme.onPrimaryContainer
            )


        ) {
            Text(
                text = "Sign up ",
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }

        Spacer(
            modifier = Modifier.height(10.dp)
        )
    }
}