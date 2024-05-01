package com.example.setupmanager.ui

import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {

}


@Composable
fun GameChoiceButton(gameName: String,
                     onClick: () -> Unit,
                     modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier.widthIn(min = 250.dp)
    ) {
        Text(gameName)
    }
}