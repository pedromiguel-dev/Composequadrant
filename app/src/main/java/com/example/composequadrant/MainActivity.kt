package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                }
            }
        }
    }
}

@Composable
fun ComposableInfoCard(
    backgroundColor: Color,
    title: String, content: String,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(text = content, textAlign = TextAlign.Justify)
    }
}

@Composable
fun ComposeQuadrantApp(){
    Column(Modifier.fillMaxWidth()) {
        Row (Modifier.weight(1f)) {
            ComposableInfoCard(
                backgroundColor =  Color.Green,
                title = "Text composable",
                content = "Displays text and follows Material Design guidelines.",
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                backgroundColor =  Color.Yellow,
                title = "Image composable",
                content = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1f)
            )

        }
        Row (Modifier.weight(1f)) {
            ComposableInfoCard(
                backgroundColor =  Color.Cyan,
                title = "Row composable",
                content = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                backgroundColor =  Color.LightGray,
                title = "Column composable",
                content = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)
            )

        }
    }
}
@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme() {
        ComposeQuadrantApp()
    }
}