package com.example.material3.Components.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


@Composable
fun ImageUI() {
    // Usando uma imagem do projeto
//    Image(painter = painterResource(id = R.drawable.jetpack_compose),
//        contentDescription = null,
//        modifier = Modifier
//            .fillMaxWidth(),
//        contentScale = ContentScale.Crop,
//        alpha = 0.5f)

    // Usando uma imagem da internet
    AsyncImage(
        model = "https://miro.medium.com/v2/resize:fit:480/1*5rNddX81woo9WvXjOEab4w.png",
        contentDescription = null,
    )
}

@Preview(showBackground = true)
@Composable
private fun ImageUIPreview() {
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        ImageUI()
    }
}