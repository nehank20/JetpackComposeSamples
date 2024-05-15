package com.example.nehank.composesamples.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RowSamples() {

    Column {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Row: horizontal Arrangement == center")
        }
        Text(text = "Horizontal : Arrangement")
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Text(text = "SpaceAround")
            Text(text = "SpaceAround")
            Text(text = "SpaceAround")
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "SpaceBetween")
            Text(text = "SpaceBetween")
            Text(text = "SpaceBetween")
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "SpaceEvenly")
            Text(text = "SpaceEvenly")
            Text(text = "SpaceEvenly")
        }
        Row(modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.Yellow), verticalAlignment = Alignment.Bottom) {
            Text(text = "Vertical Alignment = Bottom")
        }
    }


}

@Preview
@Composable
fun RowSamples_Preview() {
    RowSamples()
}