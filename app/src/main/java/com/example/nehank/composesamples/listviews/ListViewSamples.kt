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
        Student(2, "Bob", 54),
        Student(3, "Chloe", 54),
        Student(4, "Dann", 54),
        Student(5, "Ellena", 54),
        Student(6, "Florian", 54),
        Student(7, "George", 54),
        Student(8, "Henley", 54),
        Student(9, "Ian", 54),
        Student(10, "Jim", 54),
        Student(11, "Kelly", 54),
        Student(12, "Lahm", 54),
        Student(13, "Morris", 54),
        Student(14, "Niang", 54),
        Student(15, "Onix", 54),
        Student(16, "Peter", 54),
        Student(17, "Quaresma", 54),
        Student(18, "Roger", 54),
        Student(19, "Steve", 54),
        Student(20, "Tom", 54),
        Student(21, "Ursala", 54),
        Student(22, "Viz", 54),
        Student(23, "Wendy", 54),
        Student(24, "Xerses", 54),
        Student(25, "Yin", 54),
        Student(26, "Zoe", 54),

        )
}

data class Student(
    val id: Int,
    val name: String,
    val age: Int
)