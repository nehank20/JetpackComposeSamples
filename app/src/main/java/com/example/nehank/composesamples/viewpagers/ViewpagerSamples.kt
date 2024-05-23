package com.example.nehank.composesamples.viewpagers

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ViewPagerSamples() {

    val pagerState = rememberPagerState(pageCount = {
        getData().size
    })

    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            state = pagerState, modifier = Modifier
                .padding(8.dp)
        ) {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                Text(
                    text = getData()[it].name,
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .align(Alignment.BottomEnd)
        ) {
            Row {
                repeat(getData().size) {
                    CustomIndicators(pagerState.currentPage == it)
                }
            }
        }
    }
}

@Composable
fun CustomIndicators(selected: Boolean) {
    Box(
        modifier = Modifier
            .padding(4.dp)
            .background(if (selected) Color.Red else Color.Gray, shape = CircleShape)
            .size(15.dp)
    )
}

@Preview
@Composable
private fun ViewPagerSamples_Preview() {
    ViewPagerSamples()
}

private fun getData(): List<Student> {
    return listOf(
        Student(1, "Alex", 54),
        Student(2, "Bob", 35),
        Student(3, "Chloe", 71),
        Student(4, "Dann", 12),
        Student(5, "Ellena", 76),
        Student(6, "Florian", 54),
        Student(7, "George", 82),
        Student(8, "Henley", 34),
        Student(9, "Ian", 75),
        Student(10, "Jim", 13),
    )
}

data class Student(
    val id: Int,
    val name: String,
    val age: Int
)