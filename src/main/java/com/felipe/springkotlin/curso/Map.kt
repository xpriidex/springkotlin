package com.felipe.springkotlin.curso

fun main(args: Array<String>) {

    //map
    val list = (1..100).toList()
    val porDos = list.map { elelemnt -> elelemnt * 2 }
    list.map { it * 2 }

    val promedio = list.average()
    val shifted = list.map { it - promedio }

    //println(porDos)
    //println("promedio $promedio")
    //println("shifted $shifted")

    //flatmap()
    val nestedList = listOf((1..10).toList(), (11..20).toList(), (21..30).toList())

    val notFlattened = nestedList.map { it.sortedDescending() }

    val flattened = nestedList.flatMap { it.sortedDescending() }


    println(notFlattened)
    println(flattened)
}