package com.danielrono.mastercalculatorpro

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape


@Composable
fun MainScreen(){

    var display by remember { mutableStateOf("0") }

    val buttons = listOf(
        "AC","⌫","%","÷",
        "7","8","9","×",
        "4","5","6","−",
        "1","2","3","+",
        "0",".","=","√"
    )


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text(
            text="MASTER CALCULATOR PRO",
            fontSize=26.sp
        )


        Text(
            text="Scientific • Statistics • Finance",
            fontSize=14.sp
        )


        Spacer(
            modifier = Modifier.height(25.dp)
        )


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),

            shape = RoundedCornerShape(20.dp)
        ){

            Box(
                contentAlignment = Alignment.CenterEnd,
                modifier = Modifier.padding(20.dp)
            ){

                Text(
                    text=display,
                    fontSize=42.sp
                )

            }

        }


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        Column {


            buttons.chunked(4).forEach { row ->


                Row(
                    modifier = Modifier.fillMaxWidth(),

                    horizontalArrangement =
                    Arrangement.SpaceEvenly

                ){

                    row.forEach { item ->


                        Button(

                            modifier = Modifier
                                .size(75.dp)
                                .padding(4.dp),


                            onClick={


                                when(item){


                                    "AC" ->
                                        display="0"


                                    "⌫" ->
                                        if(display.length>1)
                                            display =
                                                display.dropLast(1)
                                        else
                                            display="0"


                                    "=" ->
                                        display =
                                            "Answer"


                                    else ->

                                        if(display=="0")
                                            display=item
                                        else
                                            display+=item

                                }


                            }

                        ){

                            Text(
                                text=item,
                                fontSize=20.sp
                            )

                        }

                    }


                }


            }


        }


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        Text(
            text="Developer: Daniel Rono",
            fontSize=14.sp
        )

    }

}
