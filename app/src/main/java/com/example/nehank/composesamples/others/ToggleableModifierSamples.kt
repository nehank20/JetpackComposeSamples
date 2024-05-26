package com.example.nehank.composesamples.others

import android.widget.CheckBox
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ToggleableModifierSamples() {

    var checkBoxState by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp), contentAlignment = Alignment.Center
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .toggleable(
                    value = checkBoxState,
                    role = Role.Checkbox,
                    indication = null,
                    interactionSource = MutableInteractionSource()
                ) {
                    checkBoxState = it

                },
            verticalAlignment = CenterVertically,
        ) {
            Text(text = "Row clicked", modifier = Modifier.weight(1F))
            Checkbox(checked = checkBoxState, onCheckedChange = {
                checkBoxState = it
            })
        }
    }
}

@Preview
@Composable
private fun ToggleableModifierSamples_Preview() {
    ToggleableModifierSamples()
}