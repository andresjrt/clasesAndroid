package com.example.navegacion.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SecondScreen() {
    Scaffold {
        it.toString()
        SecondBodyContent()
    }
}

@Composable
fun SecondBodyContent(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Llegué")
        Button(onClick = { /*TODO*/ },) {
            Text(text = "Regresar")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SecondPreview(){
    SecondScreen()
}