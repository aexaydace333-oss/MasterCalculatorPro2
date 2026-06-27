package com.danielrono.mastercalculatorpro.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*

@Composable
fun MainScreen(){

var tab by remember{mutableStateOf("Calculator")}

Column(Modifier.fillMaxSize().padding(12.dp)){

Text("MASTER CALCULATOR PRO")

Row{
listOf("Calculator","Stats","Finance").forEach{
Button(onClick={tab=it}){Text(it)}
}
}

when(tab){
"Calculator"->CalculatorScreen()
"Stats"->Text("Statistics / ANOVA / Tests")
"Finance"->Text("Finance Tools")
}

}

}