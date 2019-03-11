package com.felipe.springkotlin.curso

import java.io.File

fun main(args: Array<String>) {


    //File("example.txt").bufferedReader().let {
    //    if (it.ready()){
    //        println(it.readLine())
    //    }
    //}

    val str: String? = null


    str?.let {
        str.length
        println(str)
    }
}