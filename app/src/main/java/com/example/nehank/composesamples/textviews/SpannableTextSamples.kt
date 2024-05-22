package com.example.nehank.composesamples.textviews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpannableTextSamples() {

    val nameSpannableText = buildAnnotatedString {

        withStyle(
            style = SpanStyle(
                fontSize = 42.sp,
                color = Color.Red
            )
        ) {
            append("N")
        }
        append("ehank")
    }

    val privacyAndPolicySpannableText = buildAnnotatedString {
        append("Please accept ")

        pushStringAnnotation("termsTag", "termsAnnotation")
        pushStyle(
            style = SpanStyle(
                color = Color.Red,
                textDecoration = TextDecoration.Underline
            )
        )
        append("terms")
        pop()

        append(" and ")

        pushStringAnnotation("policyTag","policyAnnotation")
        pushStyle(
            style = SpanStyle(
                color = Color.Red,
                textDecoration = TextDecoration.Underline
            )
        )
        append("Privacy policy")
        pop()

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = nameSpannableText, style = TextStyle(fontSize = 20.sp))
        Spacer(modifier = Modifier.height(16.dp))
        ClickableText(text = privacyAndPolicySpannableText, onClick = {offset ->
            nameSpannableText.getStringAnnotations("termsTag",offset,offset).firstOrNull()?.item.let {
                println("Clicked on terms")
            }

            nameSpannableText.getStringAnnotations("policyTag",offset,offset).firstOrNull()?.item.let {
                println("Clicked on privacy policy")
            }
        })

    }

}

@Preview
@Composable
private fun SpannableTextSamples_Preview() {
    SpannableTextSamples()
}