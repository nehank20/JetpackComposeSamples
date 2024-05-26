package com.example.nehank.composesamples.others

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WeightModifierSample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center
    ) {

        TitleText(value = "Without weight modifier")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum lorem", color = Color.Blue)
            Spacer(
                modifier = Modifier
                    .background(Color.Red, shape = CircleShape)
                    .size(50.dp)
            )
        }

        TitleText(value = "With weight modifier")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum lorem",
                color = Color.Blue,
                modifier = Modifier.weight(1F)
            )
            Spacer(
                modifier = Modifier
                    .background(Color.Red, shape = CircleShape)
                    .size(50.dp)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))


        TitleText(value = "With weight modifier")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = {}, modifier = Modifier
                .fillMaxWidth()) {
                Text(text = "Button 1")
            }
            Spacer(modifier = Modifier.width(4.dp))
            Button(onClick = {}, modifier = Modifier
                .fillMaxWidth()) {
                Text(text = "Button 2")
            }
        }
        TitleText(value = "Without weight modifier and fill-max-width")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = {}, modifier = Modifier
                .fillMaxWidth()
                .weight(0.5F)) {
                Text(text = "Button 1")
            }
            Spacer(modifier = Modifier.width(4.dp))
            Button(onClick = {}, modifier = Modifier
                .fillMaxWidth()
                .weight(0.5F)) {
                Text(text = "Button 2")
            }
        }
        TitleText(value = "Without weight modifier and no fill-max-width")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = {}, modifier = Modifier
                .weight(0.5F)) {
                Text(text = "Button 1")
            }
            Spacer(modifier = Modifier.width(4.dp))
            Button(onClick = {}, modifier = Modifier
                .weight(0.5F)) {
                Text(text = "Button 2")
            }
        }

    }
}

@Composable
fun WeightModifierSampleOne () {
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.weight(1F).padding(8.dp), contentPadding = PaddingValues(8.dp)) {
            items(50){
                Text(text = "Text $it", fontSize = 20.sp, modifier = Modifier.fillMaxWidth())
            }
        }
        Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp).fillMaxWidth()) {
            Text(text = "Sticky Button")
        }
    }
}

@Composable
fun TitleText(value: String) {
    Text(text = value, fontSize = 16.sp)
}

@Preview
@Composable
private fun WeightModifierSample_Preview() {
//    WeightModifierSample()
    WeightModifierSampleOne()
}