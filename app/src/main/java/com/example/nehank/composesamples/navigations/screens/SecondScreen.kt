package com.example.nehank.composesamples.navigations.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.nehank.composesamples.MainViewModel

@Composable
fun SecondScreen(mainViewModel: MainViewModel, onBackButtonClicked: () -> Unit) {

    val name by mainViewModel.data.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "This is second screen, Welcome $name", style = TextStyle(
                fontSize = 30.sp,
                color = Color.Green
            )
        )

        IconButton(onClick = {
                             onBackButtonClicked()
        }, modifier = Modifier.align(Alignment.TopStart)) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")

        }
    }
}