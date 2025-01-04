package yt.educationalhost.educationalhostacademy.home.views

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import yt.educationalhost.educationalhostacademy.home.components.EventsAndMediaRow
import yt.educationalhost.educationalhostacademy.home.components.ImageCarousel
import yt.educationalhost.educationalhostacademy.home.components.SmallNotice
import yt.educationalhost.educationalhostacademy.notification.model.Notice
import yt.educationalhost.educationalhostacademy.ui.components.H1

@Composable
fun HomeScreenComp() {
    Column {
        ImageCarousel()
        H1(text = "Events and Media")
        EventsAndMediaRow {

        }
        H1(text = "Recent Notices")
        for (i in 1..10) {
            SmallNotice(
                notice = Notice(
                    title = "दशैँको रौनक श्री कलेक्सनबाट सुरु गरौं आउनुहोस्, नयाँ कपडामा नयाँ उमंगसहित दशैँ मनाऔं।",
                    description = "दशैँको रौनक श्री कलेक्सनबाट सुरु गरौं आउनुहोस्, नयाँ कपडामा नयाँ उमंगसहित दशैँ मनाऔं।\n" +
                            "Dashain Special Sale at Shri Collection\uD83C\uDF89\n" +
                            "Get up to 20% OFF on beautiful sarees, kurtis, lehengas, and more \uD83D\uDECD\uFE0F✨\n" +
                            "Hurry, limited time offer – shop your festive favorites now.\n" +
                            "Visit us today and celebrate Dashain in style\uD83C\uDF38 \n" +
                            "#ShriCollection #DashainSale #FestiveFashion #NepalFashion #TrendyOutfits",
                    image = "https://th.bing.com/th/id/OIP.1jqKRS3pQU_q3YGLfHKJPwHaLH?rs=1&pid=ImgDetMain",
                    sentBy = "Administrator ",
                    date = "2081-01-11"
                ),
                onClick = {

                }
            )
        }

    }

}