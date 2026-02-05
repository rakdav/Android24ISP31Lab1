package com.example.lab1.ui.theme.components.button

import android.content.res.Configuration
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleButtonComponent(
    text: String,
    onClick:()-> Unit
)
{
    Button(onClick = onClick) {
        Text(text = text)
    }
}
@Preview("Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview("Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun  PreviewSimpleButton(){
    SimpleButtonComponent(text = "Button", onClick = {})
}