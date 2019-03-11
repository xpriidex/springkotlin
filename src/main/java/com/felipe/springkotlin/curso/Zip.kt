package com.felipe.springkotlin.curso

fun main(args: Array<String>) {
    val list = listOf<String>("hi", "there", "kotlin", "fans")
    val containsT = listOf<Boolean>(false, true, true, false)

    //pair string , boolean
    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)

    val mapping = list.zip(list.map { it.contains("t") })

    println(zipped)
    println(mapping)


}