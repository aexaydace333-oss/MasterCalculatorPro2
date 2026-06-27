package com.danielrono.mastercalculatorpro.calculations

object MatrixEngine {

fun add(a:Array<DoubleArray>,b:Array<DoubleArray>)=
Array(a.size){i->
DoubleArray(a[i].size){j->
a[i][j]+b[i][j]
}
}

}