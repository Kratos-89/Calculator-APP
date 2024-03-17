package com.example.calculator_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.EnterTransition.Companion.None
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator_app.ui.theme.Calculator
import com.example.calculator_app.ui.theme.CalculatorAPPTheme
import com.example.calculator_app.ui.theme.CalculatorButton
import com.example.calculator_app.ui.theme.CalculatorState
import com.example.calculator_app.ui.theme.CalculatorViewModel
import com.example.calculator_app.ui.theme.LightGray
import com.example.calculator_app.ui.theme.MediumGray
import com.example.calculator_app.ui.theme.Orange

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorAPPTheme {
                MainComposable()
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainComposable()
{
    val viewModel : CalculatorViewModel = viewModel<CalculatorViewModel>()
    val state : CalculatorState = viewModel.state
    val buttonSpacing : Dp = 8.dp
    Scaffold(
        topBar = {TopAppBar(title = {Text(text = "EAZY CALC", fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),textAlign = TextAlign.Center, color = Orange)},
            colors = TopAppBarDefaults.topAppBarColors(containerColor = MediumGray)
        )}
    )
    {
            paddingValues ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(Color.DarkGray),contentAlignment = Alignment.BottomCenter)
        {
            Calculator(state = state, buttonSpacing = 8.dp,onAction = viewModel::onAction)
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculatorAPPTheme {
        MainComposable()
    }
}