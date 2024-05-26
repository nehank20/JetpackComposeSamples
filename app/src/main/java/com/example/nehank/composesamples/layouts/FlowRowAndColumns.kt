package com.example.nehank.composesamples.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowSamples() {
    FlowRow(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        maxItemsInEachRow = 4
    ) {
        repeat(20) {
            Text(
                text = "Text $it",
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowColumnSamples() {
    FlowColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        maxItemsInEachColumn = 6
    ) {
        repeat(20) {
            Text(
                text = "Text $it",
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier.padding(vertical = 8.dp, horizontal = 8.dp)
            )
        }
    }
}

@Preview
@Composable
private fun FlowColumnSamples_Preview() {
    FlowColumnSamples()
}

@Preview
@Composable
private fun FlowRowSamples_Preview() {
    FlowRowSamples()
}

