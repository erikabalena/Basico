package com.example.basico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basico.ui.theme.BasicoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Saudacoes("Android")

                }
            }
        }
    }
}

@Composable
fun Saudacoes(name: String) {
    Text(text = "The $name!")
}
@Composable
fun TitulodoApp(){
    Text(text = "Titulo do App")
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicoTheme {
        Column() {
            TitulodoApp()
            Saudacoes("Best")
            Text(text = "Your")
        }

    }
}