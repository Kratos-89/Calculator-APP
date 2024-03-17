package com.example.calculator_app.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    onClick : () -> Unit,
    symbol : String,
    modifier : Modifier)
{
    Box(
        modifier = Modifier.clip(CircleShape)
            .clickable { onClick()}.then(modifier),
        contentAlignment  = Alignment.Center
    )
    {
        Text(text = symbol,fontSize = 36.sp,
            color = Color.White, modifier = Modifier.padding(5.dp)
        )
    }
}