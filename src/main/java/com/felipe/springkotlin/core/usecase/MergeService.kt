package com.felipe.springkotlin.core.usecase

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class MergeService(private val numberService: NumberService,
                   private val negativeNumberService: NegativeNumberService,
                   private val fizzBuzzService: FizzBuzzService) {

    fun merge() = Flux.merge(
            numberService.allNumber(),
            negativeNumberService.calculateNegative(),
            fizzBuzzService.calculateFizzBuzz())
}