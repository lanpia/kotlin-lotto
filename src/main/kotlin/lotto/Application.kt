package lotto

import kotlin.io.readLine

fun userbuy() : Int{
    var buing : Int = 0
    var howmany : Int = 0
    println("���Աݾ��� �Է����ּ���.")
    buing = readLine()!!.toIntOrNull() ?: 0
    if (buing < 1000 || buing % 1000 != 0) throw  IllegalArgumentException ("[ERROR]")
    if(buing == null) throw IllegalArgumentException ("[ERROR]")
    howmany = buing / 1000
    return(howmany)
} 