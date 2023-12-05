package com.example.theweatherapptest.ui

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.theweatherapptest.ui.theme.NightColor1
import com.example.theweatherapptest.ui.theme.NightColor2
import com.example.theweatherapptest.ui.theme.SunnyDay1
import com.example.theweatherapptest.ui.theme.SunnyDay2
import com.example.theweatherapptest.ui.theme.TheWeatherAppTestTheme

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
        fontSize = 32.sp,
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


// Screen background for day
@Composable
fun DayBackground() {
    Box(
        modifier = Modifier
            .size(200.dp, 200.dp) // Adjust the size as needed
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(SunnyDay1, SunnyDay2) // Gradient colors
                )
            )
    ) {
        // Content inside the box, if any
    }
}


// Screen background for night
@Composable
fun NightBackground() {
    Box(
        modifier = Modifier
            .size(200.dp, 200.dp) // Adjust the size as needed
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(NightColor1, NightColor2) // Gradient colors
                )
            )
    ) {
        // Content inside the box, if any
    }
}
