package com.example.nehank.composesamples.textfields

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldSamples() {

    val scrollState = rememberScrollState()

    var textOne by remember {
        mutableStateOf("")
    }

    var textTwo by remember {
        mutableStateOf("")
    }

    var textThree by remember {
        mutableStateOf("")
    }

    var textFour by remember {
        mutableStateOf("")
    }

    var textFive by remember {
        mutableStateOf("")
    }

    var textSix by remember {
        mutableStateOf("")
    }

    var textSeven by remember {
        mutableStateOf("")
    }

    var textEight by remember {
        mutableStateOf("")
    }

    var textNine by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {

        TextField(
            value = textOne,
            onValueChange = {
                textOne = it
            },
            textStyle = TextStyle(fontSize = 20.sp, fontFamily = FontFamily.Monospace)
        )
        Spacing()


        TextField(
            value = textTwo,
            onValueChange = {
                textTwo = it
            },
            textStyle = TextStyle(fontSize = 20.sp, fontFamily = FontFamily.Monospace),
            label = {
                if (textTwo.isEmpty()) {
                    Text(text = "This is label", style = TextStyle(color = Color.Gray))
                } else {
                    Text(text = "This is label", style = TextStyle(color = Color.Green))
                }
            },
            placeholder = {
                Text(text = "'This is placeholder")
            },
//            isError = true
        )
        Spacing()

        TextField(
            value = textThree,
            onValueChange = {
                textThree = it
            },
            textStyle = TextStyle(fontSize = 20.sp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    modifier = Modifier.padding()
                )
            },
//            isError = true,
            trailingIcon = {
                if (textThree.isNotEmpty()) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close",
                        modifier = Modifier.clickable {
                            textThree = ""
                        })
                }
            }
        )
        Spacing()

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = textFour,
            onValueChange = {
                textFour = it
            },
            singleLine = true,
//            maxLines = 2,
            trailingIcon = {
                if (textFour.isNotEmpty()) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = " clear",
                        modifier = Modifier.clickable {
                            textFour = ""
                        })
                }
            },
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Red,
                unfocusedTextColor = Color.Blue
            ),
        )
        Spacing()

        TextField(value = textFive, onValueChange = {
            textFive = it
        }, visualTransformation = PasswordVisualTransformation())
        Spacing()

        TitleText("Capital words")
        TextField(
            value = textSix,
            onValueChange = { textSix = it },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
                autoCorrect = true,
                keyboardType = KeyboardType.Text
            )
        )
        Spacing()

        TitleText(value = "password")
        TextField(
            value = textSeven,
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = { textSeven = it },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,

                )
        )
        Spacing()

        TextField(
            modifier = Modifier.border(
                width = 0.5.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(8.dp)
            ),
            value = textEight,
            onValueChange = { textEight = it },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onNext = {

                }
            ),
            label = {
                Text(text = "Enter name")
            },
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.colors(
                disabledIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            textStyle = TextStyle(fontSize = 20.sp),
            trailingIcon = {
                if (textEight.isNotEmpty()) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = "Clear",
                        modifier = Modifier.clickable {
                            textEight = ""
                        }
                    )
                }
            }
        )
        Spacing()

        TitleText(value = "outlined text")
        OutlinedTextField(
            value = textNine,
            onValueChange = {
                textNine = it
            },
            label = {
                Text(text = "Enter name")
            }
        )

    }


}

@Composable
fun Spacing() {
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
fun TitleText(value: String) {
    Text(text = value)
}


@Preview
@Composable
private fun TextFieldSamples_Preview() {

    TextFieldSamples()
}