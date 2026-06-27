package com.danielrono.mastercalculatorpro.calculations

import kotlin.math.sqrt

object StatisticsEngine {

fun mean(x:List<Double>)=x.average()

fun variance(x:List<Double>):Double{
val m=mean(x)
return x.sumOf{(it-m)*(it-m)}/x.size
}

fun sd(x:List<Double>)=sqrt(variance(x))

}