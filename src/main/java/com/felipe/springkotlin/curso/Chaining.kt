package com.felipe.springkotlin.curso

fun main(args: Array<String>) {

    val inputRows = listOf(
            mapOf("input1.csv" to listOf(3, 5, 2, 6, 78, 795, 2)),
            mapOf("input2.csv" to listOf(-23, 234, -5)),
            mapOf("input3.csv" to listOf(9, 8, 7, 6, 5, 5, 3, 2, 2)),
            mapOf("input5.csv" to listOf()),
            mapOf("input4.csv" to listOf(23, -4, 2))
    )

    val cleaned = inputRows.flatMap { it.values }
            .flatten()
            .filter { it in 0..100 }
            .toIntArray()

    println(cleaned.joinToString())

}