package com.example.nehank.composesamples.navigations.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nehank.composesamples.MainViewModel


@Composable
fun FirstScreen(mainViewModel: MainViewModel, onClick: () -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "This is first screen", style = TextStyle(
                fontSize = 30.sp,
                color = Color.Red
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            mainViewModel.setData("nehank")
            onClick()
        }, modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(text = "Go to second screen")
        }
    }
}