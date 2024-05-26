package com.example.nehank.composesamples.others

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IntrinsicValueSample() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .height(400.dp)
                .padding(top = 100.dp)
        ) {
            Text(text = "Without intrinsic values, Divider height goes beyond text")
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Text One : Lorem Ipsum")
                Divider(modifier = Modifier.fillMaxHeight().width(4.dp))
                Text(text = "Text Two : Kayang Litor \n Kayang Litor \n Kayang Litor")
            }
        }

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 100.dp)
        ) {
            Text(text = "With intrinsic values, Divider value == max no lines of textview")
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(text = "Text One : Lorem Ipsum")
                Divider(modifier = Modifier.fillMaxHeight().width(4.dp))
                Text(text = "Text Two : Kayang Litor \n Kayang Litor \n Kayang Litor")
            }
        }

    }
}

@Preview
@Composable
private fun IntrinsicValueSample_Preview() {
    IntrinsicValueSample()
}

