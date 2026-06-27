package com.danielrono.mastercalculatorpro.calculations

import kotlin.math.pow

object FinanceEngine {

fun compound(p:Double,r:Double,n:Int)=
p*(1+r/100).pow(n)

fun simple(p:Double,r:Double,t:Int)=
p+p*r/100*t

}