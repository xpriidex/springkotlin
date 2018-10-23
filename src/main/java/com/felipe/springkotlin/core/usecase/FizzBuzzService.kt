package com.felipe.springkotlin.core.usecase

import org.springframework.stereotype.Service

@Service
class FizzBuzzService(private val numberService: NumberService) {

    fun calculateFizzBuzz() = numberService.allNumber().map { o -> calculate(o) }

    private fun calculate(i: Int): String {
        return when {
            ((i % 3 == 0) && (i % 5 == 0)) -> "FizzBuzz"
            (i % 3 == 0) -> "Fizz"
            (i % 5 == 0) -> "Buzz"
            else -> i.toString()
        }
    }
}