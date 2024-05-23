package com.example.nehank.composesamples.listviews

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyColumnSamples() {
//    LazyColumn(contentPadding = PaddingValues(16.dp), state = rememberLazyListState(4)) {
//        items(getData(), key = {
//            it.id
//        }) {
//            LazyColumnItem(student = it)
//        }
//    }
    
//
//    LazyRow(contentPadding = PaddingValues(8.dp)) {
//        items(getData(), key = {
//            it.id
//        }) {
//            LazyRowItem(student = it)
//        }
//    }
    
//    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
//        items(getData(), key = { it.id }) {
//            LazyColumnItem(student = it)
//        }
//    }


    // focuses on 7th element
    LazyHorizontalGrid(rows = GridCells.Fixed(2), state = rememberLazyGridState(7)) {
        items(getData(), key = {it.id }){
            LazyRowItem(student = it)
        }
    }
}

@Composable
fun LazyColumnItem(student: Student) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(width = 2.dp, color = Color.Gray)
    ) {
        Text(
            text = student.name, style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
            ), modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun LazyRowItem(student: Student) {
    Row(
        modifier = Modifier
            .padding(horizontal = 8.dp)
            .border(width = 2.dp, color = Color.Gray)
    ) {
        Text(
            text = student.name, style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
            ), modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview
@Composable
private fun LazyColumnSamples_Preview() {
    LazyColumnSamples()
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
        Student(11, "Kelly", 89),
        Student(12, "Lahm", 12),
        Student(13, "Morris", 33),
        Student(14, "Niang", 63),
        Student(15, "Onix", 94),
        Student(16, "Peter", 13),
        Student(17, "Quaresma", 66),
        Student(18, "Roger", 63),
        Student(19, "Steve", 26),
        Student(20, "Tom", 43),
        Student(21, "Ursala", 78),
        Student(22, "Viz", 52),
        Student(23, "Wendy", 25),
        Student(24, "Xerses", 56),
        Student(25, "Yin", 78),
        Student(26, "Zoe", 52),
        )
}

data class Student(
    val id: Int,
    val name: String,
    val age: Int
)