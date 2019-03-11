package com.felipe.springkotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class SpringkotlinApplicationTests {

    @Test
    fun contextLoads() {
        var sum =0
        for (i in 1..30) {
            sum=+(1/i)
        }
        println(sum)
    }

}
