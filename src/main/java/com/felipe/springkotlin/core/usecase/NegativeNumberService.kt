package com.felipe.springkotlin.core.usecase

import org.springframework.stereotype.Service

@Service
class NegativeNumberService(private val numberService: NumberService) {

    fun calculateNegative() = numberService.allNumber().map { o -> calculate(o) }

    private fun calculate(i: Int): Int = -1 * i

}