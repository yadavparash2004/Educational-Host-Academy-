package yt.educationalhost.educationalhostacademy.home.components

import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

@Composable
fun ImageCarousel(modifier: Modifier = Modifier) {

    val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

    imageList.add(
        SlideModel(
            "https://mahilasanakisan.org.np/sms/assets/edu1.jpg",
            "Education is the Most Powerful weapon in this world ."
        )
    )
    imageList.add(
        SlideModel(
            "https://mahilasanakisan.org.np/sms/assets/edu2.jpg",
            "Digital Education is the modern pathway of learning "
        )
    )
//    imageList.add(
//        SlideModel(
//            "https://mahilasanakisan.org.np/sms/assets/edu3.jpg",
//            "Doing nothing is also something we are doing "
//        )
//    )
    imageList.add(
        SlideModel(
            "https://mahilasanakisan.org.np/sms/assets/edu4.jpg",
            "Explore the fact ."
        )
    )





    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .aspectRatio(16 / 13f),
        contentAlignment = Alignment.Center
    ) {
        Card {
            AndroidView(
                factory = {
                    ImageSlider(it).apply {
                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
                        )
                    }

                },
                update = {
                    it.setImageList(imageList, ScaleTypes.CENTER_CROP)
                    it.startSliding(3000)

                }
            )
        }


    }
}