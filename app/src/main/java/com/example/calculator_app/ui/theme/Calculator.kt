package com.example.calculator_app.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    state : CalculatorState, modifier : Modifier = Modifier,buttonSpacing : Dp,
    onAction : (CalculatorActions) -> Unit
){
    Box(modifier = modifier)
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter).padding(15.dp),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        )
        {
            Text(
                text = state.num1 + (state.operation?.symbol?:"") + state.num2,
                textAlign = TextAlign.End, modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp,),
                color = Color.White, fontSize = if((state.num1 + (state.operation?.symbol?:"") + state.num2).length<11)60.sp
                else 40.sp,maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(onClick = {onAction(CalculatorActions.Clear)},
                    symbol = "AC", modifier = Modifier
                    .clip(
                        RoundedCornerShape(20.dp)
                    )
                    .background(LightGray)
                    .aspectRatio(2f)
                    .weight(2f))
                CalculatorButton(onClick = {onAction(CalculatorActions.Delete)},
                    symbol = "DEL", modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .background(
                        LightGray
                    ))
                CalculatorButton(onClick = {onAction(CalculatorActions.
                Operation(operation = CalculatorOperation.Divide))}, symbol = "/",
                    modifier = Modifier
                        .weight(1f)
                        .background(Orange)
                        .aspectRatio(1f))
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number = 7))},
                    symbol = "7",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(MediumGray))
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number = 8))},
                    symbol = "8",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(MediumGray))
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number = 9))},
                    symbol = "9",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(MediumGray))
                CalculatorButton(onClick = {onAction(CalculatorActions.
                Operation(operation = CalculatorOperation.Multiply))},
                    symbol = "X", modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(Orange))
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number = 4))},
                    symbol = "4",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(MediumGray))
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number = 5))},
                    symbol = "5",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(MediumGray))
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number = 6))},
                    symbol = "6",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(MediumGray))
                CalculatorButton(onClick = {onAction(CalculatorActions.
                Operation(operation = CalculatorOperation.Subtract))},
                    symbol = "-", modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(Orange))
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number = 1))},
                    symbol = "1",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(MediumGray))
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number = 2))},
                    symbol = "2",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(MediumGray))
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number = 3))},
                    symbol = "3",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(MediumGray))
                CalculatorButton(onClick = {onAction(CalculatorActions.
                Operation(operation = CalculatorOperation.Add))},
                    symbol = "+", modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(Orange))
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(onClick = {onAction(CalculatorActions.Number(number  = 0))},
                    symbol = "0", modifier = Modifier
                        .clip(
                            RoundedCornerShape(20.dp)
                        )
                        .background(MediumGray)
                        .aspectRatio(2f)
                        .weight(2f))
                CalculatorButton(onClick = {onAction(CalculatorActions.Decimal)},
                    symbol = ".", modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .background(
                            MediumGray
                        ))
                CalculatorButton(onClick = {onAction(CalculatorActions.Calculate
                )}, symbol = "=",
                    modifier = Modifier
                        .weight(1f)
                        .background(Orange)
                        .aspectRatio(1f))
            }
        }
    }
}