package com.example.nehank.composesamples.textviews

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.MarqueeSpacing
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MarqueeTextSamples() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "This is marquee text which rotates endlessly",
                style = TextStyle(
                    fontSize = 30.sp
                ),
                modifier = Modifier
                    .padding(8.dp)
                    .basicMarquee(
                        iterations = 8, // number of times it will run
                        delayMillis = 3000, // delay after 1 iteration
                        spacing = MarqueeSpacing(spacing = 50.dp), // spacing from end of first - to -  start of second
                        velocity = 200.dp // speed == higher the dp, more the speed
                    )
            )
        }
    }
}

@Preview
@Composable
private fun MarqueeTextSamples_Preview() {
    MarqueeTextSamples()
}