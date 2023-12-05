package com.example.theweatherapptest.ui

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.sp
import com.example.theweatherapptest.ui.theme.TheWeatherAppTestTheme
import dev.burnoo.cokoin.Koin

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)


        setContent {

            CompositionLocalProvider(
                LocalLayoutDirection provides LayoutDirection.Ltr
            ) {



            }
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




