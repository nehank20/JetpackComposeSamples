package com.example.nehank.composesamples.textviews

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nehank.composesamples.ui.theme.customFont

@Composable
fun TextViews_One() {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Nehank", color = Color.Red, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Font Monospace", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Custom font", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = customFont
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Letter spacing", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                letterSpacing = 8.sp
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Shadow & Offset & blur radius", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,
                shadow = Shadow(Color.Red, Offset(5F,5F),0.3F)
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Text Align", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,
                textAlign = TextAlign.End,
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Text Decoration", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,
                textDecoration = TextDecoration.Underline
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Max lines = 1, Max lines =1, Max lines =1 , Max lines =1", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,
            ),
            maxLines = 1,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "TextOverflow.Ellipsis, Max lines == 1, Max lines, Max lines", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "TextOverflow.Clip, Max lines == 1, Max lines, Max lines", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,

            ),
            maxLines = 1,
            overflow = TextOverflow.Clip,

        )
        Text(
            text = "Background color", style = TextStyle(
                color = Color.Red,
                fontSize = 30.sp,
                background = Color.Yellow
                ),
            )



    }


}

@Preview
@Composable
fun Preview_Sample() {
    TextViews_One()
}