package com.example.lab1.ui.theme.components.textfield

import android.content.res.Configuration
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1.ui.theme.components.loader.FullScreenLoaderComponent

@Composable
fun InputFieldComponent(
    text: String,
    onChange:(String)-> Unit,
    modifier: Modifier= Modifier,
    singleLine: Boolean=true,
    label: String="Some val",
    keyboardActions: KeyboardActions=KeyboardActions.Default
)
{
    OutlinedTextField(
        value = text,
        onValueChange = onChange,
        modifier=modifier,
        singleLine = singleLine,
        label = { Text(text = label) },
        keyboardActions = keyboardActions
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
fun PreviewTextFieldComponent() {
    InputFieldComponent(text = "Hello", onChange = {})
}