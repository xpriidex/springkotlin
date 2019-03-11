package com.felipe.springkotlin.curso

fun main(args: Array<String>) {
    val veryLongList = (1..999999L).toList()

    val sum = veryLongList
            .asSequence()
            .filter { it >50 }
            .map { it * 2 }
            .take(1000)
            .sum()

    val seq = generateSequence(1) {it + 1}

    println(sum)
    println(seq.take(100).toList())
}