package com.example.nehank.composesamples.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nehank.composesamples.R

@Composable
fun ImageSamples() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        Text(text = "Rounded Corner shape, ContentScale.Crop")
        Image(
            painter = painterResource(id = R.drawable.baseball),
            contentDescription = "image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(16.dp))
                .shadow(16.dp, RectangleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        
        Text(text = "Bottom to top, Order : Black, Transparent")
        GradientImageCard(R.drawable.football, getVerticalGradientBTT())
        Spacer(modifier = Modifier.height(16.dp))


        Text(text = "Top to bottom, Order : Transparent, Black")
        GradientImageCard(R.drawable.football, getVerticalGradientTTB())
        Spacer(modifier = Modifier.height(16.dp))


        Text(text = "Left to right, Order : Black, Transparent")
        GradientImageCard(R.drawable.football, getHorizontalGradientLTR())
        Spacer(modifier = Modifier.height(16.dp))


        Text(text = "Right to left, Order : Transparent, Black")
        GradientImageCard(R.drawable.football, getHorizontalGradientRTL())
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Alpha = 0.5F & 1F, ContentScale.Fit")
        Row {
            Image(
                painter = painterResource(id = R.drawable.swimming),
                contentDescription = "swimming",
                alpha = 0.5F,

                )
            Spacer(modifier = Modifier.width(4.dp))
            Image(
                painter = painterResource(id = R.drawable.swimming),
                contentDescription = "swimming",
                alpha = 1F,

                )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Circular Shape, size : 200dp")
        Image(
            painter = painterResource(id = R.drawable.swimming),
            contentDescription = "swimming",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(
                    CircleShape
                )
                .size(200.dp)
        )

        Text(text = "Circular shape with border")
        Image(
            painter = painterResource(id = R.drawable.baseball),
            contentDescription = "basebakll",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(
                    CircleShape
                )
                .size(200.dp)
                .border(width = 3.dp, color = Color.Red, shape = CircleShape)
        )


//        add gradient to the below image

        Box {
            Image(
                painter = painterResource(id = R.drawable.football),
                contentDescription = "basketball",
                modifier = Modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            )


        }


    }
}

@Composable
fun GradientImageCard(painter: Int, brush: Brush) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {

        Image(
            painter = painterResource(id = painter),
            contentDescription = "",
            modifier = Modifier.clip(
                RoundedCornerShape(8.dp)
            ),
            contentScale = ContentScale.Crop
        )
        Box(modifier = Modifier
            .fillMaxSize()
            .background(brush = brush))
    }
}


private fun getHorizontalGradientLTR() : Brush{
    val colors = listOf(Color.Black, Color.Transparent)
    return Brush.horizontalGradient(colors = colors, startX = 200F)
}

private fun getHorizontalGradientRTL() : Brush{
    val colors = listOf(Color.Transparent, Color.Black)
    return Brush.horizontalGradient(colors = colors, startX = 500F)
}

private fun getVerticalGradientTTB() : Brush{
    val colors = listOf(Color.Transparent, Color.Black)
    return Brush.verticalGradient(colors = colors, startY = 200F)
}

private fun getVerticalGradientBTT() : Brush{
    val colors = listOf(Color.Black, Color.Transparent)
    return Brush.verticalGradient(colors = colors, startY = 100F)
}


@Preview(showSystemUi = true)
@Composable
private fun ImageSamples_Preview() {
    ImageSamples()
}