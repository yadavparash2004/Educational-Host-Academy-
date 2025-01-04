package yt.educationalhost.educationalhostacademy.welcome

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import yt.educationalhost.educationalhostacademy.R
import yt.educationalhost.educationalhostacademy.welcome.views.WelcomeBackground

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.Welcome(
    modifier: Modifier = Modifier,
    animatedVisibilityScope: AnimatedVisibilityScope,
    onLoginClick: () -> Unit,
    onSignUpClick: () -> Unit,
    onNameClick: () -> Unit = {},

    ) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.welcome),
            contentDescription = "background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
//        WelcomeBackground(
//            modifier = Modifier.fillMaxSize()
//        )

        Column(
            modifier = modifier.fillMaxSize()
        ) {

//            Text(
//                text = "Animated Content ",
//                modifier = Modifier
//                    .sharedElement(
//                        animatedVisibilityScope = animatedVisibilityScope,
//                        state = rememberSharedContentState("test"),
//                        boundsTransform = { _, _ ->
//                            tween(durationMillis = 1000)
//                        }
//                    )
//            )

            Text(
                text = "Welcome",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier
                    .padding(start = 20.dp, top = 80.dp)
            )

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Bottom
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.eduhost_transparent),
                        contentDescription = "logo",
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)
                            .sharedElement(
                                state = rememberSharedContentState("logo_anim"),
                                animatedVisibilityScope = animatedVisibilityScope,
                                boundsTransform = {_,_ ->
                                    tween(1000)
                                }
                            )
                    )
                }



                Text(
                    text = "EDUCATIONAL HOST",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 20.dp)
                )

                Text(
                    text = "Bridging the Gap with Expert Coaching, Comprehensive Courses, and Exam Success Pathways for a Brighter Future.",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 20.dp , end = 2.dp),
                    lineHeight = 15.sp
                )

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp , vertical = 5.dp ),
                    onClick = {
                        onLoginClick()
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


                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp , vertical = 5.dp),
                    onClick = {},
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    border = BorderStroke(
                        width = 1.dp , color = MaterialTheme.colorScheme.onPrimaryContainer
                    )


                ) {
                    Text(
                        text = "Sign up ",
                        color =MaterialTheme.colorScheme.onPrimaryContainer,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }

                Spacer(
                    modifier = Modifier
                        .height(50.dp)
                )


            }


        }


    }

}