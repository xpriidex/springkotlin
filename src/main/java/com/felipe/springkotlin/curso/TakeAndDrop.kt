package com.felipe.springkotlin.curso

fun main(args: Array<String>) {

    //val list = (1..1000).toList()
    val list = generateSequence(0) { it + 10  }

    val first10 = list.take(10).toList()
    val first20 = list.take(20).toList()
    //val last10 = list.takeLast(10)

   // val whitoutFirst900= list.drop(900)

    println(first10)
    //println(last10)
    println(first20)
    //println(whitoutFirst900)

}