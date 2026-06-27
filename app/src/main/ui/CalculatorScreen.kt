package com.danielrono.mastercalculatorpro.ui

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*

@Composable
fun CalculatorScreen(){

var display by remember{mutableStateOf("0")}

Column{

Text(display)

for(row in listOf(
listOf("7","8","9","+"),
listOf("4","5","6","-"),
listOf("1","2","3","*"),
listOf("0","=","/","C")
)){

Row{

row.forEach{

Button(onClick={
display=if(it=="C")"0" else display+it
}){Text(it)}

}

}

}

}

}