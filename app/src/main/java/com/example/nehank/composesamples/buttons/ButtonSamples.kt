package com.example.nehank.composesamples.buttons

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.time.format.TextStyle

@Composable
fun ButtonSamples() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            logStatement("Simple button clicked")
        }) {
            Text(text = "Simple button")
        }

        Button(
            onClick = { logStatement("Full width button") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Full width button")
        }

        Button(
            onClick = { logStatement("Full width button & padding") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Full width button with padding")
        }

        Button(
            onClick = { logStatement("Full width button with text-padding") },
        ) {
            Text(
                text = "Full width button with text-padding",
                modifier = Modifier.padding(vertical = 6.dp, horizontal = 16.dp)
            )
        }

        Button(
            onClick = { logStatement("Shadow") },
            modifier = Modifier
                .width(300.dp)
                .padding(16.dp),
            elevation = ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 16.dp
            )
        ) {
            Text(text = "Shadow")
        }

        Button(
            onClick = {
                logStatement("Rounded button")
            },
            shape = RoundedCornerShape(16.dp),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
        ) {
            Text(text = "Rounded Button")
        }

        Button(onClick = {
            logStatement("Custom-Rounded corner shape")
        }, shape = RoundedCornerShape(topStart = 16.dp, )) {
            Text(text = "Custom-Rounded corner shape ")
        }

        Button(onClick = { logStatement("Cut corner shape") }, shape = CutCornerShape(8.dp)) {
            Text(text = "Cut corner shape")
        }

        Button(onClick = { /*TODO*/ }, shape = AbsoluteRoundedCornerShape(8.dp)) {
            Text(text = "Absolut eRounded Corner Shape")
        }

        Button(onClick = { /*TODO*/ }, border = BorderStroke(1.dp, Color.Red)) {
            Text(text = "Button with stroke")
        }

        Button(onClick = { }, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Yellow,
            contentColor = Color.Red,
        ), border = BorderStroke(1.dp, Color.Green)
        ) {
            Text(text = "Button colors", )
        }

        Button(onClick = { /*TODO*/ }, contentPadding = PaddingValues(15.dp)) {
            Text(text = "Content padding")
        }
        
        OutlinedButton(onClick = { /*TODO*/ }, shape = RoundedCornerShape(2.dp)) {
            Text(text = "OutLined Button")
        }
        
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Text button")
        }
    }
}

@Preview
@Composable
private fun ButtonSamples_Preview() {
    ButtonSamples()
}

private fun logStatement(msg: String) {
    Log.e("Button clicked :", " $msg")
}