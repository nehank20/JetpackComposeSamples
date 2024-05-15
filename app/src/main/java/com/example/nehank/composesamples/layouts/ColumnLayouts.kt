package com.example.nehank.composesamples.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnLayoutSamples() {
    Row(Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
            Text(text = "A1")
            Text(text = "A1")
            Text(text = "A1")
        }
        Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Bottom) {
            Text(text = "A2")
            Text(text = "A2")
            Text(text = "A2")
        }
        Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Top) {
            Text(text = "A3")
            Text(text = "A3")
            Text(text = "A3")
        }
        Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceAround) {
            Text(text = "A4")
            Text(text = "A4")
            Text(text = "A4")
        }
        Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceBetween) {
            Text(text = "A5")
            Text(text = "A5")
            Text(text = "A5")
        }
        Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "A7")
            Text(text = "A7")
            Text(text = "A7")
        }
        Column(modifier = Modifier.fillMaxHeight().width(50.dp).background(Color.Yellow), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "A8")
            Text(text = "A8")
            Text(text = "A8")
        }
    }
}

@Preview
@Composable
fun ColumnLayoutSamples_Preview() {
    ColumnLayoutSamples()
}