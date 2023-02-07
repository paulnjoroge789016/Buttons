package com.example.buttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.buttons.ui.theme.ButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonsTheme {

                var count by remember {
                    mutableStateOf(0)
                }
                Column(
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxSize()
                    ,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "$count",
                        fontSize = 40.sp
                    )

                    Button(onClick = {
                        count += 5
                    }) {
                        Text("Add")
                    }

                    Button(onClick = {
                        count -= 5
                    }) {
                        Text("Subtract")
                    }
                }

            }
        }
    }
}
