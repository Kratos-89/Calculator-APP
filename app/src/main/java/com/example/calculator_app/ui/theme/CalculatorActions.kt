package com.example.calculator_app.ui.theme

sealed class CalculatorActions {
    data class Number(val number : Int) : CalculatorActions()
    data class Operation(
        val operation : CalculatorOperation) : CalculatorActions()
    data object Clear : CalculatorActions()
    data object Delete : CalculatorActions()
    data object Calculate : CalculatorActions()
    data object Decimal : CalculatorActions()
}