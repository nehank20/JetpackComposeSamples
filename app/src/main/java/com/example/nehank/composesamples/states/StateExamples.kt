package com.example.nehank.composesamples.states

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterSamples() {

    var counter by rememberSaveable {
        mutableIntStateOf(0)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = counter.toString(),
            style = TextStyle(fontSize = 70.sp, fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(42.dp))
        Button(onClick = {
            counter++
        }) {
            Text(text = "Increase counter")
        }

    }
}

@Composable
fun Todo_Screen() {

    val listOfStudents = remember {
        mutableStateListOf("Alex", "Bob", "Charlie", "Dann", "Elena", "Florian", "George")
    }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                listOfStudents.add("New Entry")
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription =  "Add")
            }
        }
    ) {
        println(it)
        Column {
            listOfStudents.forEach { studentName->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = studentName, style = TextStyle(fontSize = 20.sp))
                    IconButton(onClick = {
                       listOfStudents.remove(studentName)
                    }) {
                        Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete" )
                    }

                }
            }
        }
    }
}

@Preview
@Composable
private fun CounterSamples_Preview() {
    CounterSamples()
}