package com.felipe.springkotlin.curso

fun main(args: Array<String>) {
    val porDos = { x: Int -> x * 2 }

    val add: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    val list = (1..100).toList()

    //print(list.filter({ element -> element % 2 == 0 }))
    //print(list.filter({ it % 2 == 0 }))
    //print(list.filter({ it.even() }))
    print(list.filter(::isEven))



}

fun isEven(i: Int) = i % 2 == 0

fun Int.even() = this % 2 == 0