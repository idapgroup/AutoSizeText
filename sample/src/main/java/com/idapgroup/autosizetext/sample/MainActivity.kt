package com.idapgroup.autosizetext.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.idapgroup.autosizetext.AutoSizeText
import com.idapgroup.autosizetext.sample.ui.theme.AutoSizeTextTheme

private const val longText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer " +
        "feugiat, ligula a volutpat dictum, velit est cursus erat, non eleifend dui leo " +
        "nec diam. Vestibulum aliquet accumsan mollis. Praesent pellentesque lacinia " +
        "pretium. Ut nec convallis tortor. Duis quis venenatis justo. Integer convallis " +
        "ipsum dolor, in dignissim diam malesuada at. Praesent ac lacus neque. Praesent " +
        "imperdiet ultricies purus sagittis accumsan. Vivamus dignissim orci ut metus " +
        "tristique porttitor. In vel auctor ipsum."

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AutoSizeTextTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        AutoSizeText(
            text = longText,
            fontSize = 14.sp,
            minFontSize = 12.sp
        )
        AutoSizeText(
            text = longText,
            maxLines = 8,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            minFontSize = 8.sp
        )
        AutoSizeText(
            modifier = Modifier.height(100.dp),
            text = longText,
            fontSize = 40.sp,
        )
        AutoSizeText(
            modifier = Modifier.height(40.dp),
            text = longText,
            fontSize = 40.sp,
        )
        Box(modifier = Modifier.height(40.dp)) {
            AutoSizeText(
                text = longText,
                fontSize = 40.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AutoSizeTextTheme {
        Greeting()
    }
}