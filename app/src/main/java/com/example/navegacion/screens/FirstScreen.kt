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
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen() {
    Scaffold {
        it.toString()
        BodyContent()
    }
}

@Composable
fun BodyContent(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola navegación")
        Button(onClick = { /*TODO*/ },) {
            Text(text = "Navega")
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun Preview(){
    FirstScreen()
}