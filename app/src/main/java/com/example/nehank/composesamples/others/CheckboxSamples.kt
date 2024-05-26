package com.example.nehank.composesamples.others

import android.widget.CheckBox
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CheckBoxSamples() {

    var checkedState by remember {
        mutableStateOf(false)
    }

//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Checkbox(
//            checked = checkedState,
//            onCheckedChange = {
//                checkedState = it
//            }
//        )
//    }

    var check by remember {
        mutableStateOf(false)
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CustomCheckBoxSamples(isSelected = check) {
            check = !it
        }
    }
}

@Composable
fun CustomCheckBoxSamples(
    modifier: Modifier = Modifier,
    isSelected: Boolean,
    onValueChange: (Boolean) -> Unit
) {
    Box(
        modifier = modifier
            .background(
                color = if (isSelected) Color.Green else Color.Transparent,
                shape = RoundedCornerShape(16.dp)
            )
            .border(2.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
            .size(60.dp)
            .clickable {
                onValueChange(isSelected)
            },
        contentAlignment = Alignment.Center
    ) {
        if (isSelected) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = "check",
                tint = Color.Blue,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}

@Preview
@Composable
private fun CheckBoxSamples_Preview() {
    CheckBoxSamples()
}
