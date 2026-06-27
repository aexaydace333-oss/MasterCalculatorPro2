package com.danielrono.mastercalculatorpro.calculations

object CalculatorEngine {

fun calculate(a:Double,b:Double,op:String):Double =
when(op){
"+"->a+b
"-"->a-b
"*"->a*b
"/"->if(b!=0.0)a/b else Double.NaN
else->0.0
}

}