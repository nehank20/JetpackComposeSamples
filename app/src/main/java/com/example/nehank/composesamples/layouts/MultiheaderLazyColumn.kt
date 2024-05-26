package com.example.nehank.composesamples.layouts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MultiHeaderLazyColumn() {

    val groupItems = getDataList().groupBy { it.type }

    var iconShow = remember {
        mutableStateMapOf<String, Boolean>()
    }

    // to set boolean to true to all values
    LaunchedEffect(key1 = Unit) {
        iconShow = iconShow.apply {
            getDataList().associate {
                it.type to true
            }.also {
                putAll(it)
            }
        }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        groupItems.forEach { (type, itemsList) ->
            item {
                Spacer(modifier = Modifier.height(30.dp))
                Row(
                    modifier = Modifier.toggleable(
                        value = iconShow[type] == true,
                        onValueChange = {
                            iconShow[type] = it
                        },
                        role = Role.Button
                    ), verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(Modifier.weight(1F)) {
                        Text(text = type, fontSize = 40.sp, fontWeight = FontWeight.Bold)
                        Text(
                            text = "(${itemsList.size})",
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Icon(
                        imageVector = if (iconShow[type] == true) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                        contentDescription = "arrow",
                        modifier = Modifier
                            .size(50.dp)

                    )
                }

            }

            if (iconShow[type] == true) {
                items(itemsList.size) { index ->
                    Text(
                        text = itemsList[index].name,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

    }

}

@Preview
@Composable
private fun MultiHeaderLazyColumn_Preview() {
    MultiHeaderLazyColumn()
}

private fun getDataList(): List<RandomObjects> {
    return listOf(
        RandomObjects(1, "Lion", "Animal"),
        RandomObjects(2, "Tiger", "Animal"),
        RandomObjects(3, "Elephant", "Animal"),
        RandomObjects(4, "Rose", "Flower"),
        RandomObjects(5, "Tulip", "Flower"),
        RandomObjects(6, "Lily", "Flower"),
        RandomObjects(7, "Sofa", "Furniture"),
        RandomObjects(8, "Table", "Furniture"),
        RandomObjects(9, "Chair", "Furniture"),
        RandomObjects(10, "Cat", "Animal"),
        RandomObjects(11, "Dog", "Animal"),
        RandomObjects(12, "Daffodil", "Flower"),
        RandomObjects(13, "Couch", "Furniture"),
        RandomObjects(14, "Desk", "Furniture")
    )
}

data class RandomObjects(
    val id: Int,
    val name: String,
    val type: String
)