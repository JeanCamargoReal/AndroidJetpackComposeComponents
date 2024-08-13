package com.example.material3.Components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SimpleButton(text: String,
                 modifier: Modifier = Modifier,
                 enabled: Boolean = true,
                 outlined: Boolean = false,
                 onClick: () -> Unit) {

    if(outlined){
        OutlinedButton(onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = RoundedCornerShape(6.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = Color.Black.copy(alpha = 0.2f)
            ),
            border = if (enabled) {
                BorderStroke(width = 1.dp, color = Color.Magenta)
            } else {
                BorderStroke(width = 1.dp, color = Color.LightGray)
            }
        ) {
            Text(text = text)
        }
    } else {
        Button(onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = RoundedCornerShape(6.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.Green,
                disabledContainerColor = Color(color = 0xFF9FB999),
                disabledContentColor = Color.White.copy(alpha = 0.5f)
            )
        ) {
            Text(text = text)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ButtonsPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SimpleButton(text = "Login",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {},
            enabled = true,
            outlined = true)

        Spacer(modifier = Modifier.height(24.dp))

        SimpleButton(text = "Login",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {},
            enabled = false,
            outlined = false)
    }
}

