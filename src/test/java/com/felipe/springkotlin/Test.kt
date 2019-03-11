package com.felipe.springkotlin

import org.junit.Test

class Test {
    @Test
    fun contextLoads() {
        var sum: Double = 0.0
        for (i in 1..30) {
            sum +=  1/i
        }
        println(sum)
    }
}