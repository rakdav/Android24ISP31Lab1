package com.example.lab1.ui.theme.components.fab

import android.content.res.Configuration
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FABComponent(text: String,onClick:()-> Unit)
{
    ExtendedFloatingActionButton(
        icon = { Icon(Icons.Filled.AddCircle,
            contentDescription = text) },
        text = {Text(text)},
        onClick = onClick
    )
}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun PreviewFABComponent() {
    FABComponent(text = "Save", onClick = {})
}