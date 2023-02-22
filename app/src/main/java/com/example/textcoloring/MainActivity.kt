package com.example.textcoloring

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.textcoloring.ui.theme.TextColoringTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextColoringTheme {
                Column {
                    Page(MaterialTheme.colorScheme.background)
                    Page(MaterialTheme.colorScheme.primary)
                    TextColoringTheme(darkTheme = true) {
                        Page(MaterialTheme.colorScheme.background)
                        Page(MaterialTheme.colorScheme.primary)
                    }
                }
            }
        }
    }

    @Composable
    fun Page(color: Color) {
        Surface(color = color) {
            Column {
                Text(
                    text = "Color 1"
                )
                Text(
                    text = "Color 2"
                )
                Text(
                    text = "Color 3"
                )
            }
        }
    }
}
