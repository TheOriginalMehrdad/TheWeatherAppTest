package com.example.theweatherapptest.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.theweatherapptest.ui.theme.TheWeatherAppTestTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            TheWeatherAppTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray
                ) {
                    MainScreen()
                }


            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    TheWeatherAppTestTheme {
        Surface(
            color = Color.Gray,
            modifier = Modifier.fillMaxSize()
        ) {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {

    Text(
        text = "Hello Android",
        modifier = Modifier.wrapContentSize(),
        color = Color.White,
        fontSize = 32.sp
    )
}

@Composable
fun Intro() {
}

@Composable
fun ForeCast() {
}

@Composable
fun WeatherNews() {
}

@Composable
fun AddCity() {
}

@Composable
fun Setting() {
}

@Composable
fun Faq() {
}

@Composable
fun Search() {
}

@Composable
fun AllAddedCity() {
}




