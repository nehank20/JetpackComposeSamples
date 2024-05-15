package com.example.nehank.composesamples.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BoxLayoutSamples() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "BottomCenter", modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "BottomEnd", modifier = Modifier.align(Alignment.BottomEnd))
        Text(text = "BottomStart", modifier = Modifier.align(Alignment.BottomStart))
        Text(text = "TopCenter", modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "TopEnd", modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "TopStart", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "Center", modifier = Modifier.align(Alignment.Center))
        Text(text = "CenterEnd", modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "CenterStart", modifier = Modifier.align(Alignment.CenterStart))
    }
}

@Preview
@Composable
private fun BoxlayoutSamples_Preview() {
    BoxLayoutSamples()
}