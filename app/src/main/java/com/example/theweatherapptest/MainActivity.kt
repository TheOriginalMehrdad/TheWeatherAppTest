package com.example.theweatherapptest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.theweatherapptest.ui.theme.TheWeatherAppTestTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            TheWeatherAppTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
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
        MainScreen()
    }
}

@Composable
fun MainScreen() {
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




