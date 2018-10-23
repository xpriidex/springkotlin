package com.felipe.springkotlin.periphery.web

import com.felipe.springkotlin.core.usecase.FizzBuzzService
import com.felipe.springkotlin.core.usecase.NumberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class NumberController (private val numberService: NumberService, private val fizzBuzzService: FizzBuzzService){
    @GetMapping("/number")
    fun number() = numberService.allNumber()

    @GetMapping("/fizzbuzz")
    fun fizzbuzz() = fizzBuzzService.calculateFizzBuzz()
}