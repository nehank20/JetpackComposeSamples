package com.example.nehank.composesamples.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun RadioButtonSamples() {

    val genderTypes = listOf("Male", "Female", "None")
    var radioState by remember {
        mutableStateOf("Male")
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            genderTypes.forEach {
                RadioButtonItem(title = it, selected = radioState == it) {
                    radioState = it
                }
            }
        }
    }
}

@Composable
fun RadioButtonItem(
    title: String,
    selected: Boolean,
    onValueChange: (String) -> Unit
) {
    Row {
        RadioButton(
            selected = selected,
            onClick = {
                onValueChange(title)
            }
        )
        Text(
            text = title, style = TextStyle(fontSize = 18.sp),
            modifier = Modifier.align(CenterVertically)
        )
    }
}

@Preview
@Composable
private fun RadioButtonSamples_Preview() {
    RadioButtonSamples()
}